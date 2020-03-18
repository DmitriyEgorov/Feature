package processors;

import java.util.concurrent.Future;

/**
 * processor
 *
 * @author Dmitriy
 * @since 09.03.2020
 */
public interface Processor<RQ extends Request, RS extends Response> {

    /**
     * process String with delay
     *
     * @param value - string
     * @return encoding value
     */
    RS process(RQ value);

    /**
     * process String with async
     *
     * @param value - string
     * @return encoding value
     */
    Future<RS> processAsync(RQ value);

}
