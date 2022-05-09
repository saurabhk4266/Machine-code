package com.test.product.Service;

import java.util.List;

import com.test.product.Model.Category;

public interface CategoryService {

	public List<Category> getAll();
	public Category getCategoryById(int id);
	public Category postCate(Category category);
	public Category updateCate(Category category);
	public void deleteCate(int id);
}
