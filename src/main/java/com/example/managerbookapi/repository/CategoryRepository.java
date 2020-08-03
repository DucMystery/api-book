package com.example.managerbookapi.repository;

import com.example.managerbookapi.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
