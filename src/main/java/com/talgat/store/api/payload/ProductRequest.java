package com.talgat.store.api.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class ProductRequest {
    private long id;

    @NotNull
    private long categoryId;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private String shortDescription;

    @NotNull
    private String additionalInfo;

    @NotNull
    private String badge;

    @NotNull
    private double price;

    @NotNull
    private double priceOld;

    @NotNull
    private int stars;

    @NotNull
    private List<String> imageUrls;
}
