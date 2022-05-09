package com.test.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.product.Model.Category;
import com.test.product.Service.CategoryService;


@RestController 
@RequestMapping("/api")
public class Controller {

	@Autowired
	private CategoryService cateServ;
	
	@GetMapping("/categories")
	public List<Category> getAll(){
		return cateServ.getAll();
	}
	@GetMapping("/categories/{id}")
	public Category getCategoryById(@PathVariable String id) {
		return cateServ.getCategoryById(Integer.parseInt(id));
	}
	
	@PostMapping("/categories")
	public Category postCate(@RequestBody Category category) {
		return cateServ.postCate(category);
	}
	
	@PutMapping("/categories/{id}")
	public Category updateCate(@RequestBody Category category) {
		return cateServ.updateCate(category);
	}
	
	@DeleteMapping("/categories/{id}")
	public ResponseEntity<HttpStatus> deleteCate(@PathVariable String id) {
		try {
			cateServ.deleteCate(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
	
	
	
	
}
