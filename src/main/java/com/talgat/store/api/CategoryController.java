package com.talgat.store.api;

import com.talgat.store.api.payload.CategorySaveRequest;
import com.talgat.store.api.payload.ItemSaveResponse;
import com.talgat.store.data.model.Category;
import com.talgat.store.data.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class CategoryController extends AbstractProtectedApi {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/category")
    public ItemSaveResponse saveCategory(@Valid @RequestBody CategorySaveRequest categorySaveRequest) {
        log.info("Get request for saving category");

        Category category = categoryService.saveCategory(categorySaveRequest);

        return new ItemSaveResponse("Category saved", category.getId());
    }
}
