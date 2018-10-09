package com.talgat.store.api.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProductSaveRequest {
    private String name;
    private String description;

    @JsonProperty("short_description")
    private String shortDescription;

    @JsonProperty("additional_info")
    private String additionalInfo;
    private String badge;
    private double price;

    @JsonProperty("old_price")
    private double oldPrice;
    private byte stars;
    private List<String> imageUrls;
}
