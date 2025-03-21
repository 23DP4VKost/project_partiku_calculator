package lv.rvt;

import java.util.Scanner;

public class FoodAdd {

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
        scanner.nextLine();

        double totalProtein = (proteinPer100g * quantity) / 100;
        double totalFat = (fatPer100g * quantity) / 100;
        double totalCarbs = (carbsPer100g * quantity) / 100;
        double kcal = (proteinPer100g * 4 + fatPer100g * 9 + carbsPer100g * 4) * (quantity / 100);

        Food food = new Food(name, totalProtein, totalFat, totalCarbs, kcal, quantity);
        foodLibrary.addFood(food);

        System.out.println("Food item added successfully.");
        System.out.println("Total Protein: " + food.getTotalProtein() + "g");
        System.out.println("Total Fat: " + food.getTotalFat() + "g");
        System.out.println("Total Carbs: " + food.getTotalCarbs() + "g");
        System.out.println("Total Calories: " + food.getTotalKcal() + "kcal");
    }

}