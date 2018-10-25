package com.talgat.store.api.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CategorySaveRequest {
    private Long id;
    @NotNull
    private String name;
}
