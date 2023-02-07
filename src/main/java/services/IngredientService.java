package services;

import model.Ingredient;

import java.util.Map;

public interface IngredientService {

    int addIngredient(Ingredient ingredient);

    Ingredient getIngredient(int id);

    Map<Integer, Ingredient> getAllIngredients();

    Ingredient editIngredient(int id, Ingredient ingredient);

    boolean deleteIngredient(int id);
}
