package com.test.product.Service;

import java.util.List;

import com.test.product.Model.Product;

public interface ProductService {
	public List<Product> getProduct();
	public Product saveProduct(Product product);
	public Product getById(int id);
	public Product updateProduct(Product product);
	public void deletePro(int id);
}
