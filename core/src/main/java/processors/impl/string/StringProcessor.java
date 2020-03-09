package processors.impl.string;

import processors.Processor;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Dmitriy
 * @since 09.02.2020
 */
public class StringProcessor implements Processor<StringRequest, StringResponse> {
    private static final Long DEFAULT_DELAY = 2000L;

    private ExecutorService executor = Executors.newSingleThreadExecutor();

    /**
     * process String with delay
     *
     * @param value - string
     * @return encoding value
     */
    public StringResponse process (StringRequest value) {
        try {
            Thread.sleep(DEFAULT_DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new StringResponse(
                new String(value.getBody().getBytes(), StandardCharsets.UTF_8),
                LocalDateTime.now()
        );
    }

    public Future<StringResponse> processAsync (StringRequest value) {
        return executor.submit(() -> process(value));
    }
}
