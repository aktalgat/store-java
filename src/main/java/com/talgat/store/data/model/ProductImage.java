package com.talgat.store.data.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    public ProductImage() {}
}
