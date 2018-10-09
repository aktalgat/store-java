package com.talgat.store.data.service;

import com.talgat.store.api.payload.ProductSaveRequest;
import com.talgat.store.data.model.Product;

public interface ProductService {
    Product saveProduct(ProductSaveRequest productSaveRequest);
    Product saveProduct(Product product);
}
