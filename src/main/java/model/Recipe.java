package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;

@Data
@AllArgsConstructor
public class Recipe {

    private String name;
    private int cookingTime;
    private LinkedList<Ingredient> ingredients;
    private LinkedList<String> steps;
}
