package com.talgat.store.api;

import com.talgat.store.data.model.Product;
import com.talgat.store.data.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ProductPublicController extends AbstractPublicApi {
    private ProductService productService;

    public ProductPublicController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProductList() {
        log.info("Public api. Request for getting all products");

        return productService.getProductList();
    }
}
