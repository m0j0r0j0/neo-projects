package com.neoprojects.controller;

import java.util.Optional;

import javax.ws.rs.PathParam;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neoprojects.dto.Category;
import com.neoprojects.dto.Product;
import com.neoprojects.repo.CategoryRepo;
import com.neoprojects.repo.ProductRepo;

@RestController
public class MainController {

	@Autowired
	CategoryRepo categoryRepo;

	@Autowired
	ProductRepo productRepo;

	@PostMapping(value = { "/addCatagory" })
	public String addCatagory(@RequestBody Category category) {

		categoryRepo.save(category);

		return "success";
	}

	@PostMapping(value = { "/addProduct" })
	public String addProduct(@RequestBody Product product) {

		productRepo.save(product);

		return "success";
	}

	@GetMapping(value = { "/getCategory/{id}" })
	public Optional<Category> getCategory(@PathParam(value = "id") int id) {

		Optional<Category> categoryDto = categoryRepo.findById(id);

		return categoryDto;
	}

	@GetMapping(value = { "/getProduct/{id}" })
	public JSONObject getProduct(@PathParam(value = "id") int id) {

		Optional<Product> productDto = productRepo.findById(id);

		Optional<Category> categoryDto = categoryRepo.findById(productDto.get().getCategoryId());

		JSONObject json = new JSONObject();
		json.put("product", productDto);
		json.put("category", categoryDto);

		return json;
	}

}
