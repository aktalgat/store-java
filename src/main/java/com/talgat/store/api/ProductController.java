package com.talgat.store.api;

import com.talgat.store.api.payload.ProductSaveRequest;
import com.talgat.store.api.payload.ProductSaveResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {

    @PostMapping("/api/product/save")
    public ProductSaveResponse saveProduct(@RequestBody ProductSaveRequest productSaveRequest) {
        //TODO save product to db
        return new ProductSaveResponse("Product saved", 12);
    }
}
