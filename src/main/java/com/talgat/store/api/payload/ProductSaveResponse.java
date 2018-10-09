package com.talgat.store.api.payload;

import lombok.Data;

@Data
public class ProductSaveResponse extends AbstractApiResponse {
    private long id;

    public ProductSaveResponse(String message, int id) {
        super(message);
        this.id = id;
    }
}
