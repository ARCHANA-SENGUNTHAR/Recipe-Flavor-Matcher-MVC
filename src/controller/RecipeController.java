package controller;

import dao.RecipeDAO;
import view.RecipeView;

public class RecipeController {
    RecipeDAO dao = new RecipeDAO();
    RecipeView view = new RecipeView();

    public void findRecipes(String ingredient) {
        view.displayRecipes(dao.getRecipesByIngredient(ingredient));
    }

    public void addRecipe(String name, String desc) {
        dao.addRecipe(name, desc);
        System.out.println("Recipe added successfully!");
    }
}