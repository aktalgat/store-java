package com.talgat.store.data.service;

import com.talgat.store.api.payload.CategorySaveRequest;
import com.talgat.store.data.model.Category;

import java.util.List;

public interface CategoryService {
    Category saveCategory(CategorySaveRequest categorySaveRequest);
    Category saveCategory(Category category);
    List<Category> getCategoryList();
}
