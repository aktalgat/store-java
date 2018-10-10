package com.talgat.store.data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_id")
    private Long categoryId;

    private String name;
    private String description;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "additional_info")
    private String additionalInfo;

    private String badge;
    private Double price;

    @Column(name = "price_old")
    private Double priceOld;
    private Integer stars;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "product_id")
    private List<ProductImage> productImageList = new ArrayList<>();

    public Product() {}

    public Product(Long categoryId, String name, String description, String shortDescription, String additionalInfo,
                   String badge, Double price, Double priceOld, Integer stars) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.shortDescription = shortDescription;
        this.additionalInfo = additionalInfo;
        this.badge = badge;
        this.price = price;
        this.priceOld = priceOld;
        this.stars = stars;
    }
}
