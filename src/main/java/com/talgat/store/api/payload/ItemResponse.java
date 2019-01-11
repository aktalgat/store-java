package com.talgat.store.api.payload;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@Data
@EqualsAndHashCode(callSuper = false)
public class ItemResponse extends AbstractApiResponse {
    private long id;

    public ItemResponse(String message, Long id) {
        super(message);
        this.id = id;
    }

    public ItemResponse(String message, Long id, HttpStatus status) {
        super(message);
        this.id = id;
        setStatus(status);
    }
}
