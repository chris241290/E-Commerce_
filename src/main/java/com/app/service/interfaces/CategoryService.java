package com.app.service.interfaces;

import com.app.model.Category;
import com.app.payloads.CategoryResponse;
import com.app.payloads.DTO.CategoryDTO;

public interface CategoryService {

	CategoryDTO createCategory(Category category);

	CategoryResponse getCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

	CategoryDTO updateCategory(Category category, Long categoryId);

	String deleteCategory(Long categoryId);
}
