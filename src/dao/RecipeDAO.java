package dao;

import db.DBConnection;
import model.Recipe;
import java.sql.*;
import java.util.*;

public class RecipeDAO {
    public List<Recipe> getRecipesByIngredient(String ingredient) {
        List<Recipe> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT DISTINCT r.* FROM recipes r " +
                    "JOIN recipe_ingredients ri ON r.recipe_id=ri.recipe_id " +
                    "JOIN ingredients i ON i.ingredient_id=ri.ingredient_id " +
                    "WHERE i.ingredient_name=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ingredient);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Recipe(
                        rs.getInt("recipe_id"),
                        rs.getString("recipe_name"),
                        rs.getString("description")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addRecipe(String name, String desc) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO recipes(recipe_name, description) VALUES (?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, desc);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}