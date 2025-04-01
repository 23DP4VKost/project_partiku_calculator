package lv.rvt;

import java.util.Scanner;

public class FoodAdd {
/// wipe console after action
    public static void addFoodItem(Scanner scanner, Library foodLibrary) {
        System.out.println("Enter food name:");
        String name = scanner.nextLine();

        System.out.println("Enter protein per 100g:");
        double proteinPer100g = scanner.nextDouble();
        System.out.println("Enter fat per 100g:");
        double fatPer100g = scanner.nextDouble();
        System.out.println("Enter carbs per 100g:");
        double carbsPer100g = scanner.nextDouble();
        System.out.println("Enter the quantity consumed (in grams):");
        double quantity = scanner.nextDouble();
        double kcal = proteinPer100g * 4 + fatPer100g * 9 + carbsPer100g * 4;
        scanner.nextLine();

        Food food = new Food(name, proteinPer100g, fatPer100g, carbsPer100g,kcal,quantity);
        foodLibrary.addFood(food);

        System.out.println(name + " added successfully.");
        System.out.println();
        System.out.println("Total Protein: " + food.calculateTotalProtein() + "g");
        System.out.println("Total Fat: " + food.calculateTotalFat() + "g");
        System.out.println("Total Carbs: " + food.calculateTotalCarbs() + "g");
        System.out.println("Total Calories: " + food.calculateTotalKcal() + "kcal");
        System.out.println();

    }
}