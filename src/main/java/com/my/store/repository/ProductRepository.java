package com.my.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.store.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long>{

}
