package com.talgat.store.api.payload;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public abstract class AbstractApiResponse {
    private int code = 200;
    private HttpStatus status = HttpStatus.OK;
    private String message;

    public AbstractApiResponse() {}

    public AbstractApiResponse(String message) {
        this.message = message;
    }
}
