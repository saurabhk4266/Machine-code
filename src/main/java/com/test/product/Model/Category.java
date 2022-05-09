package com.test.product.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {

	@Id
	private int id;
	private String cateName;
	
	@OneToMany(mappedBy="category")
	private Set<Product> product;
	
	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	

	public Category(int id, String cateName, Set<Product> product) {
		super();
		this.id = id;
		this.cateName = cateName;
		this.product = product;
	}

	public Category() {
		super();
	}
	
	
}
