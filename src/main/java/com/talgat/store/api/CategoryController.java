package com.talgat.store.api;

import com.talgat.store.api.payload.CategorySaveRequest;
import com.talgat.store.api.payload.ItemSaveResponse;
import com.talgat.store.data.model.Category;
import com.talgat.store.data.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class CategoryController extends AbstractProtectedApi {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/categories")
    public ItemSaveResponse saveCategory(@Valid @RequestBody CategorySaveRequest categorySaveRequest) {
        log.info("Request for saving category");

        Category category = categoryService.saveCategory(categorySaveRequest);

        return new ItemSaveResponse("Category saved", category.getId());
    }

    @GetMapping("/categories")
    public List<Category> getCategoryList() {
        log.info("Request for getting all categories");

        return categoryService.getCategoryList();
    }

    @PutMapping("/categories")
    public ItemSaveResponse updateCategory(@Valid @RequestBody CategorySaveRequest categorySaveRequest) {
        log.info("Request for update category");

        return new ItemSaveResponse("Category updated", 0L);
    }
}
