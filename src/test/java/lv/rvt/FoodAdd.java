package lv.rvt;

import java.util.Scanner;

public class FoodAdd {

    public static void addFoodItem(Scanner scanner, Library foodLibrary) {
        
        System.out.println("\n=================================================================");
        System.out.println("                      ADD A NEW FOOD ITEM                        ");
        System.out.println("=================================================================\n");

        System.out.println("Enter food name:");
        String name = scanner.nextLine();

        double proteinPer100g, fatPer100g, carbsPer100g, quantity;

        while (true) {
            System.out.println("Enter protein per 100g:");
            proteinPer100g = scanner.nextDouble();
            if (proteinPer100g < 0) {
                System.out.println("Error: Value cannot be less than 0. Please try again.");
                continue;
            }

            System.out.println("Enter fat per 100g:");
            fatPer100g = scanner.nextDouble();
            if (fatPer100g < 0) {
                System.out.println("Error: Value cannot be less than 0. Please try again.");
                continue;
            }

            System.out.println("Enter carbs per 100g:");
            carbsPer100g = scanner.nextDouble();
            if (carbsPer100g < 0) {
                System.out.println("Error: Value cannot be less than 0. Please try again.");
                continue;
            }

            System.out.println("Enter the quantity consumed (in grams):");
            quantity = scanner.nextDouble();
            if (quantity < 0) {
                System.out.println("Error: Value cannot be less than 0. Please try again.");
                continue;
            }

            break;
        }

        double kcal = proteinPer100g * 4 + fatPer100g * 9 + carbsPer100g * 4;
        scanner.nextLine();

        Food food = new Food(name, proteinPer100g, fatPer100g, carbsPer100g,kcal,quantity);
        foodLibrary.addFood(food);
        System.out.println();

        
        System.out.println(name + " added successfully.");
        System.out.println();
        System.out.println("Total Protein: " + food.calculateTotalProtein() + "g");
        System.out.println("Total Fat: " + food.calculateTotalFat() + "g");
        System.out.println("Total Carbs: " + food.calculateTotalCarbs() + "g");
        System.out.println("Total Calories: " + food.calculateTotalKcal() + "kcal");
        System.out.println();
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        clearConsole.ClearConsole();
        


    }
}