package com.neoprojects.repo;

import org.springframework.data.repository.CrudRepository;

import com.neoprojects.dto.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {

}
