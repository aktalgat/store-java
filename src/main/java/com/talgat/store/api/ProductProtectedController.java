package com.talgat.store.api;

import com.talgat.store.api.payload.ProductRequest;
import com.talgat.store.api.payload.ItemResponse;
import com.talgat.store.data.model.Product;
import com.talgat.store.data.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class ProductProtectedController extends AbstractProtectedApi {
    private ProductService productService;

    public ProductProtectedController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public ItemResponse saveProduct(@Valid @RequestBody ProductRequest productRequest) {
        log.info("Request for saving product");
        log.info("Product request: {}", productRequest);
        Product product = productService.saveProduct(productRequest);

        return new ItemResponse("Product saved", product.getId());
    }

    @GetMapping("/products")
    public List<Product> getProductPublicList() {
        log.info("Request for getting all products");

        return productService.getProductList();
    }
}
