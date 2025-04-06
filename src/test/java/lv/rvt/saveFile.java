package lv.rvt;

import java.io.IOException;
import java.util.Scanner;

public class saveFile {

    public static void saveToFile(Scanner scanner, Library foodLibrary) {
        System.out.println("Enter the filename to save the food library:");
        String filename = scanner.nextLine();
        System.out.println();

        try {
        
            inFileWriter.FileWriting(foodLibrary.getFoodList(), filename);

            System.out.println("Food library saved to " + filename+""+".txt");
            System.out.println();
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
            clearConsole.ClearConsole();
        } 
        
        catch (IOException e) {
            System.out.println("Error saving to txt file: " + e.getMessage());
        }
    }
}