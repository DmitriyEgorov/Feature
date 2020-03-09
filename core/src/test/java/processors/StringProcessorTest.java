package processors;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import processors.impl.string.StringProcessor;
import processors.impl.string.StringRequest;
import processors.impl.string.StringResponse;

import java.time.LocalDateTime;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;

/**
 * @author Dmitriy
 * @since 09.02.2020
 */
public class StringProcessorTest {
    private static final Long DEFAULT_DELAY = 2000L;
    private StringProcessor processor = new StringProcessor();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void test() {
        Long start = System.currentTimeMillis();
        String value = "1";
        StringRequest request = new StringRequest(value, LocalDateTime.now());
        String result = processor.process(request).getBody();
        Long end = System.currentTimeMillis();
        assertTrue(DEFAULT_DELAY <= (end - start));
        assertEquals(value, result);
    }

    @Test
    public void testAsync() throws Exception {
        Long start = System.currentTimeMillis();
        String value = "1";
        StringRequest request = new StringRequest(value, LocalDateTime.now());
        Future<StringResponse> response = processor.processAsync(request);
        Long end = System.currentTimeMillis();
        assertTrue(DEFAULT_DELAY > (end - start));
        String resultString = response.get(DEFAULT_DELAY * 2, TimeUnit.MILLISECONDS).getBody();
        assertEquals(value, resultString);
    }

    @Test
    public void testAsync_timeout() throws Exception{
        Long start = System.currentTimeMillis();
        String value = "1";
        StringRequest request = new StringRequest(value, LocalDateTime.now());
        Future<StringResponse> response = processor.processAsync(request);
        Long end = System.currentTimeMillis();
        assertTrue(DEFAULT_DELAY > (end - start));
        expectedException.expect(TimeoutException.class);
        response.get(0, TimeUnit.MILLISECONDS);
    }


}