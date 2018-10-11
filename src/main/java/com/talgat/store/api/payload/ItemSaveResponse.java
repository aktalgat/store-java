package com.talgat.store.api.payload;

import lombok.Data;

@Data
public class ItemSaveResponse extends AbstractApiResponse {
    private long id;

    public ItemSaveResponse(String message, Long id) {
        super(message);
        this.id = id;
    }
}