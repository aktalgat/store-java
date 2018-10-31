package com.talgat.store.api.payload;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ItemResponse extends AbstractApiResponse {
    private long id;

    public ItemResponse(String message, Long id) {
        super(message);
        this.id = id;
    }
}
