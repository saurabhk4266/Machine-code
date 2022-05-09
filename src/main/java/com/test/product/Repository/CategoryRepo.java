package com.test.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.product.Model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
