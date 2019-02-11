package com.talgat.store.data.dao;

import com.talgat.store.data.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    @Override
    List<Product> findAll();

    @Override
    Optional<Product> findById(Long id);
}
