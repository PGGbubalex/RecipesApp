package impl;

import model.Ingredient;
import org.springframework.stereotype.Service;
import services.IngredientService;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {

    private int id = 0;

    private static Map<Integer, Ingredient> ingredients = new LinkedHashMap<>();

    @Override
    public int addIngredient(Ingredient ingredient) {
        ingredients.put(id, ingredient);
        return id++;
    }

    @Override
    public Ingredient getIngredient(int id) {
        return ingredients.get(id);
    }

    @Override
    public Map<Integer, Ingredient> getAllIngredients() {
        return ingredients;
    }

    @Override
    public Ingredient editIngredient(int id, Ingredient ingredient) {
        if (ingredients.containsKey(id)) {
            ingredients.put(id, ingredient);
            return ingredient;
        }
        return null;
    }

    @Override
    public boolean deleteIngredient(int id) {
        if (ingredients.containsKey(id)) {
            ingredients.remove(id);
            return true;
        }
        return false;
    }

}
