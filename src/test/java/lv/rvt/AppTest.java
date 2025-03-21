package lv.rvt;

import java.util.Scanner;

public class AppTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Library foodLibrary = new Library();

    while (true) {
      System.out.println("Choose an option:");
      System.out.println("1. Add a new food item");
      System.out.println("2.Food Library(Edit/Delete)");
      System.out.println("3. Save the food library to a CSV file");

      int choice = scanner.nextInt();
      scanner.nextLine();

      if (choice==1) {
        FoodAdd.addFoodItem(scanner, foodLibrary);
        }

      else if (choice==2){
        while (true) {        
          System.out.println("Choose an option:");
          System.out.println("1. View food library");
          System.out.println("2. Edit a food item");
          System.out.println("3. Delete a food item");

          int choice2 = scanner.nextInt();
          scanner.nextLine();

          if (choice2==1){
            System.out.println(foodLibrary.getLibrary());
              break;}
              
          else if (choice2==2){
              Library.editFoodItem(scanner, foodLibrary);
              break;}

          else if (choice==3){
              Library.deleteFoodItem(scanner, foodLibrary);
              break;}
              }

            }

      else if (choice==3){
        saveFile.saveToFile(scanner, foodLibrary);
          }
 
      else{
         System.out.println("Invalid choice. Please try again.");
        }
    }
  }

}