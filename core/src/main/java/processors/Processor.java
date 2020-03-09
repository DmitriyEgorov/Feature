package processors;

import java.util.concurrent.Future;

/**
 * @author Dmitriy
 * @since 09.03.2020
 */
public interface Processor<RQ extends Request, RS extends Response> {

    RS process (RQ value);

    Future<RS> processAsync (RQ value);

}
