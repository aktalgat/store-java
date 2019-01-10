package com.talgat.store.api;

import com.talgat.store.data.model.Product;
import com.talgat.store.data.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductPublicController extends AbstractPublicApi {

    private static final Logger log = LoggerFactory.getLogger(ProductPublicController.class);
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
