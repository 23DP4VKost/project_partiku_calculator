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

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public String getLibrary() {
        StringBuilder productInfo = new StringBuilder();
        System.out.println();
        productInfo.append(ConsoleColors.BLUE_BOLD).append(String.format("| %-5s | %-20s | %-15s | %-20s | %-15s | %-20s | %-15s|\n", 
            "ID", "Name", "Quantity (g)", "Total Protein (g)", "Total Fat (g)", "Total Carbs (g)", "Total Kcal")).append(ConsoleColors.RESET);
        productInfo.append(ConsoleColors.YELLOW).append("--------------------------------------------------------------------------------------------------------------------------------\n").append(ConsoleColors.RESET);
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            productInfo.append(ConsoleColors.GREEN).append(String.format("| %-5d | %-20s | %-15.2f | %-20.2f | %-15.2f | %-20.2f | %-15.2f|\n", 
                i+1, 
                food.getName(), 
                food.getQuantity(), 
                food.calculateTotalProtein(), 
                food.calculateTotalFat(), 
                food.calculateTotalCarbs(), 
                food.calculateTotalKcal())).append(ConsoleColors.RESET);
                productInfo.append(ConsoleColors.YELLOW).append("--------------------------------------------------------------------------------------------------------------------------------\n").append(ConsoleColors.RESET);
        }
        return productInfo.toString();
    }

    public static void editFoodItem(Scanner scanner, Library foodLibrary) {
        System.out.println("\n===============================");
        System.out.println("       EDIT A FOOD ITEM        ");
        System.out.println("===============================\n");

        System.out.println(foodLibrary.getLibrary());
        System.out.println("Enter the ID of the food item to edit:");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index <= 0 || index > foodLibrary.getFoodList().size()) {
            System.out.println("Invalid index. Please try again.");
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
            clearConsole.ClearConsole();
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
        double kcalPer100g = proteinPer100g * 4 + fatPer100g * 9 + carbsPer100g * 4;
        System.out.println("Enter the quantity consumed (in grams):");
        double quantity = scanner.nextDouble();
        scanner.nextLine();

        Food food = new Food(name, proteinPer100g, fatPer100g, carbsPer100g, kcalPer100g, quantity);
        foodLibrary.editFood(index - 1, food);
        System.out.println("Food item edited successfully.");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        clearConsole.ClearConsole();
    }

    public static void deleteFood(Scanner scanner, Library foodLibrary) {
        System.out.println("\n===============================");
        System.out.println("       DELETE A FOOD ITEM      ");
        System.out.println("===============================\n");

        System.out.println(foodLibrary.getLibrary());
        System.out.println("Enter the ID of the food item to delete:");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index <= 0 || index > foodLibrary.getFoodList().size()) {
            System.out.println("Invalid ID. Please try again.");
            return;
        }

        foodLibrary.deleteFood(index - 1);
        System.out.println("Food item deleted successfully.");
    }
}
