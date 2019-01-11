package com.talgat.store.api;

import com.talgat.store.api.payload.CategoryRequest;
import com.talgat.store.api.payload.ItemResponse;
import com.talgat.store.data.model.Category;
import com.talgat.store.data.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CategoryProtectedController extends AbstractProtectedApi {
    private static final Logger log = LoggerFactory.getLogger(CategoryProtectedController.class);
    private CategoryService categoryService;

    public CategoryProtectedController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/categories")
    public ItemResponse saveCategory(@Valid @RequestBody CategoryRequest categoryRequest) {
        log.info("Request for saving category");

        Category category = categoryService.saveCategory(categoryRequest);

        return new ItemResponse("Category saved", category.getId(), HttpStatus.CREATED);
    }

    @GetMapping("/categories")
    public List<Category> getCategoryList() {
        log.info("Request for getting all categories");

        return categoryService.getCategoryList();
    }

    @PutMapping("/categories")
    public ItemResponse updateCategory(@Valid @RequestBody CategoryRequest categoryRequest) {
        log.info("Request for update category");

        return new ItemResponse("Category updated", 0L);
    }
}
