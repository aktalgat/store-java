package com.talgat.store.data.service;

import com.talgat.store.api.payload.CategorySaveRequest;
import com.talgat.store.data.model.Category;

public interface CategoryService {
    Category saveCategory(CategorySaveRequest categorySaveRequest);
    Category saveCategory(Category category);
}