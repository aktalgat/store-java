package com.talgat.store.api;

import com.talgat.store.api.payload.CategoryRequest;
import com.talgat.store.api.payload.ItemResponse;
import com.talgat.store.data.model.Category;
import com.talgat.store.data.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class CategoryProtectedController extends AbstractProtectedApi {
    private CategoryService categoryService;

    public CategoryProtectedController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/categories")
    public ItemResponse saveCategory(@Valid @RequestBody CategoryRequest categoryRequest) {
        log.info("Request for saving category");

        Category category = categoryService.saveCategory(categoryRequest);

        return new ItemResponse("Category saved", category.getId());
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
