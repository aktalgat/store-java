package com.talgat.store.data.service;

import com.talgat.store.api.payload.CategorySaveRequest;
import com.talgat.store.data.dao.CategoryRepository;
import com.talgat.store.data.model.Category;
import com.talgat.store.exception.InternalException;
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
        Category newCategory = null;
        try {
            newCategory = categoryRepository.save(category);
        } catch (Exception e) {
            throw new InternalException("Internal error in saving");
        }
        log.info("Saved category: {}", newCategory);
        return newCategory;
    }
}
