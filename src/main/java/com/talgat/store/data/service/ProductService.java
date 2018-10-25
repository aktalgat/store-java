package com.talgat.store.data.service;

import com.talgat.store.api.payload.ProductSaveRequest;
import com.talgat.store.data.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(ProductSaveRequest productSaveRequest);
    Product saveProduct(Product product);
    List<Product> getProductList();
}
