package com.talgat.store.data.service;

import com.talgat.store.api.payload.CategorySaveRequest;
import com.talgat.store.data.dao.CategoryRepository;
import com.talgat.store.data.model.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category saveCategory(CategorySaveRequest categorySaveRequest) {
        Category category = new Category(categorySaveRequest.getName());

        return saveCategory(category);
    }

    @Override
    public Category saveCategory(Category category) {
        Category newCategory = categoryRepository.save(category);
        log.info("Saved category: {}", newCategory);
        return newCategory;
    }
}
