package processors.impl.string;

import processors.Response;

import java.time.LocalDateTime;

/**
 * response for string
 *
 * @author Dmitriy
 * @since 09.03.2020
 */
public class StringResponse implements Response<String> {

    private String body;
    private LocalDateTime creationDateTime;

    /**
     * default constructor
     */
    public StringResponse() {

    }

    /**
     * constructor
     *
     * @param body             - body of response
     * @param creationDateTime - date time of creation of response
     */
    public StringResponse(String body, LocalDateTime creationDateTime) {
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
        return this.creationDateTime;
    }

    @Override
    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

}
