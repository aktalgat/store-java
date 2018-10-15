package com.talgat.store.api;

import com.talgat.store.api.payload.ProductSaveRequest;
import com.talgat.store.api.payload.ItemSaveResponse;
import com.talgat.store.data.model.Product;
import com.talgat.store.data.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@Secured("ROLE_ADMIN")
public class ProductController extends AbstractProtectedApi {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public ItemSaveResponse saveProduct(@Valid @RequestBody ProductSaveRequest productSaveRequest) {
        log.info("Get request for saving product");

        Product product = productService.saveProduct(productSaveRequest);

        return new ItemSaveResponse("Product saved", product.getId());
    }
}
