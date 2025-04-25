package lv.rvt;

import java.util.Scanner;

public class AppTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Library foodLibrary = new Library();

    System.out.println("=========================================");
    System.out.println("   WELCOME TO THE MACRO CALCULATOR APP   ");
    System.out.println("=========================================");
    System.out.println("Track your food macros and calories easily!\n");

    while (true) {
      System.out.println("Choose an option:");
      System.out.println("+---------------------------------------+");
      System.out.println("| 1. Add a new food item                |");
      System.out.println("| 2. Food Library (View/Edit/Delete)    |");
      System.out.println("| 3. Save the food library to a TXT file|");
      System.out.println("+---------------------------------------+");

      int choice = scanner.nextInt();
      clearConsole.ClearConsole();
      scanner.nextLine();

      if (choice == 1) {
      FoodAdd.addFoodItem(scanner, foodLibrary);
      } else if (choice == 2) {
      while (true) {
        System.out.println("Choose an option:");
        System.out.println("+-----------------------------+");
        System.out.println("| 1. View food library        |");
        System.out.println("| 2. Edit a food item         |");
        System.out.println("| 3. Delete a food item       |");
        System.out.println("+-----------------------------+");

        int choice2 = scanner.nextInt();
        scanner.nextLine();

        if (choice2 == 1) {
        clearConsole.ClearConsole();
        System.out.println(foodLibrary.getLibrary(scanner));
        break;
        } else if (choice2 == 2) {
        clearConsole.ClearConsole();
        Library.editFoodItem(scanner, foodLibrary);
        break;
        } else if (choice2 == 3) {
        Library.deleteFood(scanner, foodLibrary);
        clearConsole.ClearConsole();
        break;
        }
      }
      } else if (choice == 3) {
      saveFile.saveToFile(scanner, foodLibrary);
      } else {
      System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT + "Invalid choice. Please try again." + ConsoleColors.RESET);
      }
    }
  }

}