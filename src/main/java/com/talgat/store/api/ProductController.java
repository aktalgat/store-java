package com.talgat.store.api;

import com.talgat.store.api.payload.ProductSaveRequest;
import com.talgat.store.api.payload.ProductSaveResponse;
import com.talgat.store.data.model.Product;
import com.talgat.store.data.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/api/product/save")
    public ProductSaveResponse saveProduct(@RequestBody ProductSaveRequest productSaveRequest) {
        log.info("Get request for saving product");

        Product product = productService.saveProduct(productSaveRequest);

        return new ProductSaveResponse("Product saved", product.getId());
    }
}
