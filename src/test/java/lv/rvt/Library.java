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

    public ArrayList<Food> getLibrary() {
        return foodList;
    }

    public static void editFoodItem(Scanner scanner, Library foodLibrary) {
        System.out.println(foodLibrary.getLibrary());
        System.out.println("Enter the index of the food item to edit:");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= foodLibrary.getLibrary().size()) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.println("Enter new food name:");
        String name = scanner.nextLine();

        System.out.println("Enter new protein per 100g:");
        double protein = scanner.nextDouble();
        System.out.println("Enter new fat per 100g:");
        double fat = scanner.nextDouble();
        System.out.println("Enter new carbs per 100g:");
        double carbs = scanner.nextDouble();
        System.out.println("Enter new kcal per 100g:");
        double kcal = scanner.nextDouble();
        scanner.nextLine();

        Food food = new Food(name, protein, fat, carbs, kcal);
        foodLibrary.editFood(index, food);
        System.out.println("Food item edited successfully.");
    }

    public static void deleteFoodItem(Scanner scanner, Library foodLibrary) {
        System.out.println(foodLibrary.getLibrary());
        System.out.println("Enter the index of the food item to delete:");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= foodLibrary.getLibrary().size()) {
            System.out.println("Invalid index.");
            return;
        }

        foodLibrary.deleteFood(index);
        System.out.println("Food item deleted successfully.");
    }
}

