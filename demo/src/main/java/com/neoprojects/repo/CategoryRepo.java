package com.neoprojects.repo;

import org.springframework.data.repository.CrudRepository;

import com.neoprojects.dto.Category;


public interface CategoryRepo extends CrudRepository<Category, Integer> {

}
