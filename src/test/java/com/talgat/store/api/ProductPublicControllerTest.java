package com.talgat.store.api;

import com.talgat.store.data.dao.ProductRepository;
import com.talgat.store.data.model.Product;
import com.talgat.store.data.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductPublicControllerTest {

    @Mock
    ProductRepository productRepository;

    @Mock
    ProductService productService;

    @Mock
    ProductPublicController publicController;

    @Test
    void getProductList() {
        List<Product> list = publicController.getProductList();
    }
}