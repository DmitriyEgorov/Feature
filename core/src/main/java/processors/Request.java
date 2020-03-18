package processors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * request for <T> object
 *
 * @author Dmitriy
 * @since 09.03.2020
 */
public interface Request<T> extends Serializable {

    /**
     * get body of request
     *
     * @return body of request
     */
    T getBody();

    /**
     * set body of request
     *
     * @param body - body of request
     */
    void setBody(T body);

    /**
     * get date time of creation of request
     *
     * @return date time of creation of request
     */
    LocalDateTime getCreationDateTime();

    /**
     * set date time of creation of request
     *
     * @param creationDateTime - date time of creation of request
     */
    void setCreationDateTime(LocalDateTime creationDateTime);

}
