package lv.rvt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class inFileWriter {
    public static void FileWriting(ArrayList<Food> foodList, String filename) throws IOException {
        
        FileWriter writer = new FileWriter(filename+".txt");

        writer.append(String.format("%-20s|%-15s|%-20s|%-20s|%-20s|%-15s\n", "Name", "Quantity (g)", "Total Protein (g)", "Total Fat (g)", "Total Carbs (g)", "Total Kcal"));
        for (Food food : foodList) {
            writer.append("--------------------------------------------------------------------------------------------------------------------------------\n");
            writer.append(String.format("%-20s|%-15.2f|%-20.2f|%-20.2f|%-20.2f|%-15.2f\n", 
                food.getName(), 
                food.getQuantity(), 
                food.calculateTotalProtein(), 
                food.calculateTotalFat(), 
                food.calculateTotalCarbs(), 
                food.calculateTotalKcal()));
            writer.append("--------------------------------------------------------------------------------------------------------------------------------\n");
        }

        writer.flush();
        writer.close();
    }
}
