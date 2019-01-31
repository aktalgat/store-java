package com.talgat.store.api;

import com.talgat.store.data.model.Category;
import com.talgat.store.data.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CategoryPublicControllerTest {

    @Mock
    CategoryService categoryService;

    @InjectMocks
    CategoryPublicController categoryPublicController;

    @Test
    void getCategoryPublicList() {
        List<Category> list = categoryPublicController.getCategoryPublicList();
    }
}