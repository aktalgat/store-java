package com.talgat.store.api;

import com.talgat.store.data.model.Category;
import com.talgat.store.data.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class CategoryPublicController extends AbstractPublicApi {
    private CategoryService categoryService;

    public CategoryPublicController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> getCategoryList() {
        log.info("Public api. Request for getting all categories");

        return categoryService.getCategoryList();
    }
}
