package com.talgat.store.api;

import com.talgat.store.data.model.Category;
import com.talgat.store.data.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryPublicController extends AbstractPublicApi {
    private static final Logger log = LoggerFactory.getLogger(CategoryPublicController.class);
    private CategoryService categoryService;

    public CategoryPublicController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Category> getCategoryPublicList() {
        log.info("Public api. Request for getting all categories");

        return categoryService.getCategoryList();
    }
}
