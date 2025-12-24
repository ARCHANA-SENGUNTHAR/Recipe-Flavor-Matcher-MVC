package view;

import controller.RecipeController;
import java.util.Scanner;

public class MainView {
    Scanner sc = new Scanner(System.in);
    RecipeController controller = new RecipeController();
    MenuView menu = new MenuView();

    public void start() {
        while (true) {
            menu.showMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ingredient: ");
                    String ing = sc.nextLine();
                    controller.findRecipes(ing);
                    break;
                case 2:
                    System.out.print("Recipe name: ");
                    String name = sc.nextLine();
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    controller.addRecipe(name, desc);
                    break;
                case 3:
                    System.out.println("Thank you!");
                    System.exit(0);
            }
        }
    }
}