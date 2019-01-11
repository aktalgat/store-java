package com.talgat.store.api.payload;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public abstract class AbstractApiResponse {
    private HttpStatus status = HttpStatus.OK;
    private String message;

    public AbstractApiResponse() {}

    public AbstractApiResponse(String message) {
        this.message = message;
    }
}
