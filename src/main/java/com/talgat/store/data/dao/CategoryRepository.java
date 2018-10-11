package com.talgat.store.data.dao;

import com.talgat.store.data.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
    @Override
    List<Category> findAll();
}
