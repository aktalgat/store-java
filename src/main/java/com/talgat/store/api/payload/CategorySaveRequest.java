package com.talgat.store.api.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CategorySaveRequest {
    @NotNull
    private String name;
}
