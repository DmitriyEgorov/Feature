package processors;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
        String result = processor.encode(value);
        Long end = System.currentTimeMillis();
        assertTrue(DEFAULT_DELAY <= (end - start));
        assertEquals(value, result);
    }

    @Test
    public void testAsync() throws Exception {
        Long start = System.currentTimeMillis();
        String value = "1";
        Future<String> result = processor.encodeAsync(value);
        Long end = System.currentTimeMillis();
        assertTrue(DEFAULT_DELAY > (end - start));
        String resultString = result.get(DEFAULT_DELAY * 2, TimeUnit.MILLISECONDS);
        assertEquals(value, resultString);
    }

    @Test
    public void testAsync_timeout() throws Exception{
        Long start = System.currentTimeMillis();
        String value = "1";
        Future<String> result = processor.encodeAsync(value);
        Long end = System.currentTimeMillis();
        assertTrue(DEFAULT_DELAY > (end - start));
        expectedException.expect(TimeoutException.class);
        result.get(0, TimeUnit.MILLISECONDS);
    }


}