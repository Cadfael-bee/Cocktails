package com.my.store.service;

import com.my.store.model.Recipe;

public interface RecipeService {
	
	Recipe save(Recipe recipe);
	
	Recipe get(String id) throws Exception;

}
