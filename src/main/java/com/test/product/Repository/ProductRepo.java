package com.test.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.test.product.Model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
