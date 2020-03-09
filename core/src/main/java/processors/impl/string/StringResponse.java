package processors.impl.string;

import processors.Response;

import java.time.LocalDateTime;

/**
 * @author Dmitriy
 * @since 09.03.2020
 */
public class StringResponse implements Response<String> {

    private String body;
    private LocalDateTime creationDateTime;

    public StringResponse() {

    }

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
