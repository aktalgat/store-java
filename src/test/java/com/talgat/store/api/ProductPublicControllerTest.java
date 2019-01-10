package com.talgat.store.api;

import com.talgat.store.data.dao.ProductRepository;
import com.talgat.store.data.service.ProductService;
import com.talgat.store.data.service.ProductServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class ProductPublicControllerTest {

    @Mock
    ProductRepository productRepository;

    @Mock
    ProductService productService;

    @InjectMocks
    ProductPublicController publicController;

    @BeforeEach
    void setUp() {
        productService = new ProductServiceImpl(productRepository);
        publicController = new ProductPublicController(productService);
    }

    @Test
    void getProductList() {

    }
}