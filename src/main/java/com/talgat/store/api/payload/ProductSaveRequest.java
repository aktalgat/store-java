package com.talgat.store.api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class ProductSaveRequest {
    @NotNull
    private long categoryId;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    @JsonProperty("short_description")
    private String shortDescription;

    @NotNull
    @JsonProperty("additional_info")
    private String additionalInfo;

    @NotNull
    private String badge;

    @NotNull
    private double price;

    @NotNull
    @JsonProperty("price_old")
    private double priceOld;

    @NotNull
    private int stars;

    @NotNull
    private List<String> imageUrls;
}
