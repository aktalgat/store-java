package com.talgat.store.api;

import com.talgat.store.api.payload.CategorySaveRequest;
import com.talgat.store.api.payload.ItemSaveResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class CategoryController {

    @PostMapping("/api/category/save")
    public ItemSaveResponse saveCategory(@Valid @RequestBody CategorySaveRequest categorySaveRequest) {
        log.info("Get request for saving category");

        //TODO save category to db

        return new ItemSaveResponse("Category saved", 1L);
    }
}
