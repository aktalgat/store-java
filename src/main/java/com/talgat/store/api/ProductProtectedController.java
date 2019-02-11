package com.talgat.store.api;

import com.talgat.store.api.payload.ProductRequest;
import com.talgat.store.api.payload.ItemResponse;
import com.talgat.store.data.model.Product;
import com.talgat.store.data.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductProtectedController extends AbstractProtectedApi {
    private static final Logger log = LoggerFactory.getLogger(ProductProtectedController.class);
    private ProductService productService;

    public ProductProtectedController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public ItemResponse saveProduct(@Valid @RequestBody ProductRequest productRequest) {
        log.info("Request for saving product");
        log.info("Product request: {}", productRequest);
        Product product = productService.saveProduct(productRequest);

        return new ItemResponse("Product saved", product.getId(), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public List<Product> getProductPublicList() {
        log.info("Request for getting all products");

        return productService.getProductList();
    }

    @PutMapping("/products")
    public ItemResponse updateCategory(@Valid @RequestBody ProductRequest productRequest) {
        log.info("Request for update product");

        long id = productService.update(productRequest);

        return new ItemResponse("Product updated", id);
    }
}
