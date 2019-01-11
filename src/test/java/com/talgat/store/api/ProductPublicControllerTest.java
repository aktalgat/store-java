package com.talgat.store.api;

import com.talgat.store.data.dao.ProductRepository;
import com.talgat.store.data.model.Product;
import com.talgat.store.data.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class ProductPublicControllerTest {

    @MockBean
    ProductRepository productRepository;

    @MockBean
    ProductService productService;

    @InjectMocks
    ProductPublicController publicController;

    @Test
    void getProductList() {
        List<Product> list = publicController.getProductList();
    }
}