package com.my.store.service.impl;

import org.springframework.stereotype.Service;

import com.my.store.model.Recipe;
import com.my.store.repository.RecipeRepository;
import com.my.store.service.RecipeService;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Service
public class RecipeServiceImpl implements RecipeService {
	
	private final RecipeRepository recipeRepository;

	@Override
	public Recipe save(Recipe recipe) {
		return recipeRepository.save(recipe);
	}

	@Override
	public Recipe get(String id) throws Exception {
		return recipeRepository.findById(Long.valueOf(id)).orElseThrow(() -> new Exception("No recipe"));
	}

}
