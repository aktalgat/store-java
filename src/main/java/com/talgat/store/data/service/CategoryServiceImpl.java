package com.talgat.store.data.service;

import com.talgat.store.api.payload.CategoryRequest;
import com.talgat.store.data.dao.CategoryRepository;
import com.talgat.store.data.model.Category;
import com.talgat.store.exception.InternalException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private static final Logger log = LoggerFactory.getLogger(CategoryServiceImpl.class);
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    @Transactional
    public Category saveCategory(CategoryRequest categoryRequest) {
        Category category = new Category(categoryRequest.getName());

        return saveCategory(category);
    }

    @Override
    @Transactional
    public Category saveCategory(Category category) {
        Category newCategory;
        try {
            newCategory = categoryRepository.save(category);
        } catch (Exception e) {
            throw new InternalException("Internal error in saving");
        }
        log.info("Saved category: {}", newCategory);
        return newCategory;
    }

    @Override
    public List<Category> getCategoryList() {
        return categoryRepository.findAll();
    }

    @Override
    @Transactional
    public long update(CategoryRequest categoryRequest) {
        Category category = categoryRepository.findById(categoryRequest.getId())
                .orElseThrow(() -> new InternalException("Couldn't find Category with such id"));
        category.setName(categoryRequest.getName());
        saveCategory(category);

        return category.getId();
    }
}
