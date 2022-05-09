package com.test.product.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.product.Model.Category;
import com.test.product.Repository.CategoryRepo;
import com.test.product.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepo repo;

	@Override
	public List<Category> getAll() {
		return repo.findAll();
	}

	@Override
	public Category getCategoryById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Category postCate(Category category) {
		return repo.save(category);
	}

	@Override
	public Category updateCate(Category category) {
		return repo.save(category);
	}

	@Override
	public void deleteCate(int id) {
		Category cate= repo.getOne(id);
		repo.delete(cate);
	}

	
	
	
	
	
	
	
	
}
