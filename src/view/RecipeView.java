package view;

import model.Recipe;
import java.util.List;

public class RecipeView {
    public void displayRecipes(List<Recipe> recipes) {
        if (recipes.isEmpty()) {
            System.out.println("No recipes found.");
        } else {
            for (Recipe r : recipes) {
                System.out.println("\nRecipe: " + r.getName());
                System.out.println("Description: " + r.getDescription());
            }
        }
    }
}