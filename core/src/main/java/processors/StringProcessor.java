package processors;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author Dmitriy
 * @since 09.02.2020
 */
public class StringProcessor {
    private static final Long DEFAULT_DELAY = 2000L;

    private ExecutorService executor = Executors.newSingleThreadExecutor();

    /**
     * encode String with delay
     *
     * @param value - string
     * @return encoding value
     */
    public String encode (String value) {
        try {
            Thread.sleep(DEFAULT_DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new String(value.getBytes(), StandardCharsets.UTF_8);
    }

    public Future<String> encodeAsync (String value) {
        return executor.submit(() -> encode(value));
    }
}
