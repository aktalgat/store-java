package com.talgat.store.data.service;

import com.talgat.store.api.payload.CategoryRequest;
import com.talgat.store.data.model.Category;

import java.util.List;

public interface CategoryService {

    Category saveCategory(CategoryRequest categoryRequest);

    Category saveCategory(Category category);

    List<Category> getCategoryList();

    long update(CategoryRequest categoryRequest);
}
