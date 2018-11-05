package com.talgat.store.api.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CategoryRequest {
    private Long id;

    @NotNull
    private String name;
}
