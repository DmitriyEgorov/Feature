package processors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * response for <T> object
 *
 * @author Dmitriy
 * @since 09.03.2020
 */
public interface Response<T> extends Serializable {

    /**
     * get body of response
     *
     * @return body of response
     */
    T getBody();

    /**
     * set body of response
     *
     * @param body - body of response
     */
    void setBody(T body);

    /**
     * get date time of creation of response
     *
     * @return date time of creation of response
     */
    LocalDateTime getCreationDateTime();

    /**
     * set date time of creation of response
     *
     * @param creationDateTime - date time of creation of response
     */
    void setCreationDateTime(LocalDateTime creationDateTime);

}
