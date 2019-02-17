package com.talgat.store.api;

import com.talgat.store.data.dao.ProductRepository;
import com.talgat.store.data.model.Product;
import com.talgat.store.data.service.ProductService;
import com.talgat.store.data.service.ProductServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductPublicControllerTest {

    @Mock
    ProductRepository productRepository;

    @InjectMocks
    ProductServiceImpl productService;

    ProductPublicController publicController;

    @BeforeEach
    void init() {
        publicController = new ProductPublicController(productService);

        List<Product> list = new ArrayList<>();
        list.add(new Product(1L, "Молоко", "Молоко", "Молоко", "Молоко", "-10", 30D, 35D, 5));
        Mockito.lenient().when(productRepository.findAll()).thenReturn(list);
    }

    @Test
    void getProductList() {
        List<Product> list = publicController.getProductList();
        System.out.println(list.size());
        list.forEach(System.out::println);
    }
}