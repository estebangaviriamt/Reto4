package com.example.demo.Interface;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.Modelo.Category;

public interface CategoryInterface extends CrudRepository<Category, Integer> {

}
