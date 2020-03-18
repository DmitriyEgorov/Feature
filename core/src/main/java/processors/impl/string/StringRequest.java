package processors.impl.string;

import processors.Request;

import java.time.LocalDateTime;

/**
 * request for string
 *
 * @author Dmitriy
 * @since 09.03.2020
 */
public class StringRequest implements Request<String> {

    private String body;
    private LocalDateTime creationDateTime;

    /**
     * default constructor
     */
    public StringRequest() {
    }

    /**
     * constructor
     *
     * @param body             - body of request
     * @param creationDateTime - date time of creation of request
     */
    public StringRequest(String body, LocalDateTime creationDateTime) {
        this.body = body;
        this.creationDateTime = creationDateTime;
    }

    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    @Override
    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

}
