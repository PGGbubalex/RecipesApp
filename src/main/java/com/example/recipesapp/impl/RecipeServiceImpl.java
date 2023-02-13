package com.example.recipesapp.impl;

import com.example.recipesapp.model.Recipe;
import org.springframework.stereotype.Service;
import com.example.recipesapp.services.RecipeService;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    private static int recipeId = 0;

    private static Map<Integer, Recipe> recipes = new LinkedHashMap<>();

    @Override
    public int addRecipe(Recipe recipe) {
        recipeId++;
        recipes.put(recipeId, recipe);
        return recipeId;
    }

    @Override
    public Recipe getRecipe(int id) {
        return recipes.get(id);
    }

    @Override
    public Map<Integer, Recipe> getAllRecipes() {
        return recipes;
    }

    @Override
    public Recipe editRecipe(int id, Recipe recipe) {
        if (recipes.containsKey(id)) {
            recipes.put(id, recipe);
            return recipes.get(id);
        }
        return null;
    }

    @Override
    public boolean deleteRecipe(int id) {
        if (recipes.containsKey(id)) {
            recipes.remove(id);
            return true;
        }
        return false;
    }
}
