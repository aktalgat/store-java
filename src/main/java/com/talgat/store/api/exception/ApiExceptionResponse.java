package com.talgat.store.api.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ApiExceptionResponse {
    private int code;
    private HttpStatus status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private String message;
    //private String debugMessage;

    private ApiExceptionResponse() {
        timestamp = LocalDateTime.now();
    }

    public ApiExceptionResponse(HttpStatus status) {
        this();
        this.status = status;
        this.code = status.value();
    }

    public ApiExceptionResponse(HttpStatus status, Throwable ex) {
        this();
        this.status = status;
        this.code = status.value();
        this.message = "Unexpected error";
        //this.debugMessage = ex.getLocalizedMessage();
    }

    public ApiExceptionResponse(HttpStatus status, String message, Throwable ex) {
        this();
        this.status = status;
        this.code = status.value();
        this.message = message;
        //this.debugMessage = ex.getLocalizedMessage();
    }
}
