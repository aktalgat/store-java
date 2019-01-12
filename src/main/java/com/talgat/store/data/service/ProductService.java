package com.talgat.store.data.service;

import com.talgat.store.api.payload.ProductRequest;
import com.talgat.store.data.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(ProductRequest productRequest);

    Product saveProduct(Product product);

    List<Product> getProductList();
}
