package com.test.product.Controller;

import java.util.List;

import org.hibernate.annotations.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.product.Model.Product;
import com.test.product.Service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService proSer;
	
	@GetMapping("/product")
	public List<Product> getProduct(){
		return proSer.getProduct();
	}
	
	@GetMapping("/product/{id}")
	public Product getById(@PathVariable String id) {
		return proSer.getById(Integer.parseInt(id));
	}
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return proSer.saveProduct(product);
	}
	@PutMapping("/product/{id}")
	public Product updateProduct(@RequestBody Product product) {
		return proSer.updateProduct(product);
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<HttpStatus> deletePro(@PathVariable String id) {
		try {
			proSer.deletePro(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
	
	
	
	
}
