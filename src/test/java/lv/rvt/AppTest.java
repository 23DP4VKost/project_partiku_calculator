package lv.rvt;

import java.util.Scanner;

public class AppTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    analize analyzer = new analize();

    while (true) {
      System.out.println("\nChoose an option:");
      System.out.println("1. Calculate nutrition");
      int choice = scanner.nextInt();
      scanner.nextLine();
      if (choice==1) {
        calculation(scanner, analyzer);} 

      else {
        System.out.println("Invalid choice.");
          }
    }
  }

  private static void calculation(Scanner scanner, analize analyzer) {
    System.out.print("Enter food name: ");
    String name = scanner.nextLine();
    System.out.print("Enter protein (g per 100g): ");
    double protein = scanner.nextDouble();
    System.out.print("Enter carbs (g per 100g): ");
    double carbs = scanner.nextDouble();
    System.out.print("Enter fat (g per 100g): ");
    double fat = scanner.nextDouble();
    System.out.print("Enter kcal (per 100g): ");
    int kcal = scanner.nextInt();
    System.out.print("Enter quantity (grams): ");
    double quantity = scanner.nextDouble();
  
    analyzer.setName(name);
    analyzer.setProtein(protein);
    analyzer.setCarbs(carbs);
    analyzer.setFat(fat);
    analyzer.setKcal(kcal);
    analyzer.setQuantity(quantity);

    System.out.println("\nNutrition for " + quantity + "g of " + name + ":");
    System.out.println("Protein: " + analyzer.calculateProtein() + "g");
    System.out.println("Carbs: " + analyzer.calculateCarbs() + "g");
    System.out.println("Fat: " + analyzer.calculateFat() + "g");
    System.out.println("Kcal: " + analyzer.calculateKcal() + " kcal");
  }

}