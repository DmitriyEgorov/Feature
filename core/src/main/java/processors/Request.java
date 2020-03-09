package processors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Dmitriy
 * @since 09.03.2020
 */
public interface Request<T> extends Serializable {

    T getBody();

    void setBody(T body);

    LocalDateTime getCreationDateTime();

    void setCreationDateTime(LocalDateTime creationDateTime);

}
