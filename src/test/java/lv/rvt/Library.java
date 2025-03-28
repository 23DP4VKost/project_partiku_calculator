package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Food> foodList;

    public Library() {
        this.foodList = new ArrayList<>();
    }

    public void addFood(Food food) {
        foodList.add(food);
    }

    public void editFood(int index, Food food) {
        if (index >= 0 && index < foodList.size()) {
            foodList.set(index, food);
        }
    }

    public void deleteFood(int index) {
        if (index >= 0 && index < foodList.size()) {
            foodList.remove(index);
        }
    }

    public Food getFood(int index) {
        if (index >= 0 && index < foodList.size()) {
            return foodList.get(index);
        }
        return null;
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public String getLibrary() {
        StringBuilder productInfo = new StringBuilder();///add id to the list
        productInfo.append("Name | Quantity (g) | Total Protein (g) | Total Fat (g) | Total Carbs (g) | Total Kcal\n");
    productInfo.append("--------------------------------------------------------------------------------------\n");
        for (Food food : foodList) {
            productInfo.append(food.getName()).append(" | ")
              .append(food.getQuantity()).append(" | ")
              .append(food.calculateTotalProtein()).append(" | ")
              .append(food.calculateTotalFat()).append(" | ")
              .append(food.calculateTotalCarbs()).append(" | ")
              .append(food.calculateTotalKcal()).append("\n");
        }
        return productInfo.toString();
    }

// edit by id
    public static void editFoodItem(Scanner scanner, Library foodLibrary) {
        System.out.println(foodLibrary.getLibrary());
        System.out.println("Enter the index of the food item to edit:");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= foodLibrary.getFoodList().size()) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.println("Enter new food name:");
        String name = scanner.nextLine();

        System.out.println("Enter new protein per 100g:");
        double proteinPer100g = scanner.nextDouble();
        System.out.println("Enter new fat per 100g:");
        double fatPer100g = scanner.nextDouble();
        System.out.println("Enter new carbs per 100g:");
        double carbsPer100g = scanner.nextDouble();
        System.out.println("Enter new kcal per 100g:");
        double kcalPer100g = scanner.nextDouble();
        System.out.println("Enter the quantity consumed (in grams):");
        double quantity = scanner.nextDouble();
        scanner.nextLine();

        Food food = new Food(name, proteinPer100g, fatPer100g, carbsPer100g, kcalPer100g, quantity);
        foodLibrary.editFood(index, food);
        System.out.println("Food item edited successfully.");
    }

  public static void deleteFood(Scanner scanner, Library foodLibrary) {
        System.out.println(foodLibrary.getLibrary());
        System.out.println("Enter the index of the food item to delete:");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= foodLibrary.getFoodList().size()) {
            System.out.println("Invalid index.");
            return;
        }

        foodLibrary.deleteFood(index);
        System.out.println("Food item deleted successfully.");
    }  
}
