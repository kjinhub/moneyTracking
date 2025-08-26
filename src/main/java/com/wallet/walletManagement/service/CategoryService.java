package com.wallet.walletManagement.service;

import com.wallet.walletManagement.model.Category;
import com.wallet.walletManagement.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {


private CategoryRepository categoryRepository;

@Autowired
public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
}
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public List<Category> getCategoriesByType(String type) {
        return categoryRepository.findByType(type);
    }

    public void createCategory(Category category) {
        categoryRepository.insert(category);
    }

    public void updateCategory(Category category) {
        categoryRepository.update(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.delete(id);
    }
}
