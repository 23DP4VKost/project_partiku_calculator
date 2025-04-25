package lv.rvt;

import java.util.Scanner;

public class FoodAdd {

    public static void addFoodItem(Scanner scanner, Library foodLibrary) {
        
        System.out.println("\n=================================================================");
        System.out.println("                      ADD A NEW FOOD ITEM                        ");
        System.out.println("=================================================================\n");

        System.out.println(ConsoleColors.CYAN + "Enter food name:" + ConsoleColors.RESET);
        String name = scanner.nextLine();

        double proteinPer100g, fatPer100g, carbsPer100g, quantity;

        while (true) {
            System.out.println(ConsoleColors.CYAN + "Enter protein per 100g:"+ ConsoleColors.RESET);
            proteinPer100g = scanner.nextDouble();
            if (proteinPer100g < 0) {
                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + "Error: Value cannot be less than 0. Please try again." + ConsoleColors.RESET);
                continue;
            }

            System.out.println(ConsoleColors.CYAN + "Enter fat per 100g:"+ ConsoleColors.RESET);
            fatPer100g = scanner.nextDouble();
            if (fatPer100g < 0) {
                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + "Error: Value cannot be less than 0. Please try again." + ConsoleColors.RESET);
                continue;
            }

            System.out.println(ConsoleColors.CYAN + "Enter carbs per 100g:"+ ConsoleColors.RESET);
            carbsPer100g = scanner.nextDouble();
            if (carbsPer100g < 0) {
                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + "Error: Value cannot be less than 0. Please try again." + ConsoleColors.RESET);
                continue;
            }

            System.out.println(ConsoleColors.CYAN + "Enter the quantity consumed (in grams):"+ ConsoleColors.RESET);
            quantity = scanner.nextDouble();
            if (quantity < 0) {
                System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + "Error: Value cannot be less than 0. Please try again." + ConsoleColors.RESET);
                continue;
            }

            break;
        }
        

        double kcal = proteinPer100g * 4 + fatPer100g * 9 + carbsPer100g * 4;
        scanner.nextLine();

        clearConsole.ClearConsole();

        Food food = new Food(name, proteinPer100g, fatPer100g, carbsPer100g,kcal,quantity);
        foodLibrary.addFood(food);
        System.out.println();

        
        System.out.println(ConsoleColors.CYAN +name + " added successfully." + ConsoleColors.RESET);
        System.out.println();
        System.out.println("Total Protein: " + food.calculateTotalProtein() + "g");
        System.out.println("Total Fat: " + food.calculateTotalFat() + "g");
        System.out.println("Total Carbs: " + food.calculateTotalCarbs() + "g");
        System.out.println("Total Calories: " + food.calculateTotalKcal() + "kcal");
        System.out.println();
        System.out.println(ConsoleColors.CYAN + "Press Enter to continue..." + ConsoleColors.RESET);
        scanner.nextLine();
        clearConsole.ClearConsole();
        


    }
}