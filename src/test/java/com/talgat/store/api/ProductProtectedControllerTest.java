package com.talgat.store.api;

import com.talgat.store.data.dao.ProductRepository;
import com.talgat.store.data.model.Product;
import com.talgat.store.data.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductProtectedControllerTest {

    @Mock
    ProductRepository productRepository;

    @Mock
    ProductService productService;

    @InjectMocks
    ProductPublicController publicController;

    @Test
    void saveProduct() {
    }

    @Test
    void getProductPublicList() {
        List<Product> list = publicController.getProductList();
    }
}