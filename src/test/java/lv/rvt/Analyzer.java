package lv.rvt;


import java.util.Scanner;

public class Analyzer {

    public static void addFoodItem(Scanner scanner, Library foodLibrary) {
        System.out.println("Enter food name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter protein per 100g:");
        double proteinPer100g = scanner.nextDouble();
        System.out.println("Enter fat per 100g:");
        double fatPer100g = scanner.nextDouble();
        System.out.println("Enter carbs per 100g:");
        double carbsPer100g = scanner.nextDouble();
        double kcalPer100g =  (proteinPer100g * 4 + carbsPer100g * 4 + fatPer100g * 9);
   
        Food food = new Food(name, proteinPer100g, fatPer100g, carbsPer100g, kcalPer100g);
        foodLibrary.addFood(food);
        System.out.println("Food item added successfully.");
    }
///File Writer
}