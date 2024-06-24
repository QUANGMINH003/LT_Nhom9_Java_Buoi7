package com.example.LT_Nhom9_Java_Buoi7.services;

import com.example.LT_Nhom9_Java_Buoi7.entity.Category;
import com.example.LT_Nhom9_Java_Buoi7.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> GetAll() {
        return categoryRepository.findAll();
    }
}

