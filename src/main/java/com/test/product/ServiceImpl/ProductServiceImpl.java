package com.test.product.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.product.Model.Product;
import com.test.product.Repository.ProductRepo;
import com.test.product.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo repo;
	
	@Override
	public List<Product> getProduct() {
		return repo.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public Product getById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public void deletePro(int id) {
		Product product= repo.getOne(id);
		repo.delete(product);
		
	}
	
	

	
}
