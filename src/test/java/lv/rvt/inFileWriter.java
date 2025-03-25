package lv.rvt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/// Update formatting
public class inFileWriter {
    public static void FileWriting(ArrayList<Food> foodList, String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);

        writer.append("Name|Quantity (g)|Total Protein (g)|Total Fat (g)|Total Carbs (g)|Total Kcal\n");
        for (Food food : foodList) {
            writer.append(food.getName()).append("|");
            writer.append(String.valueOf(food.getQuantity())).append("|");
            writer.append(String.valueOf(food.calculateTotalProtein())).append("|");
            writer.append(String.valueOf(food.calculateTotalFat())).append("|");
            writer.append(String.valueOf(food.calculateTotalCarbs())).append("|");
            writer.append(String.valueOf(food.calculateTotalKcal())).append("\n");
        }

        writer.flush();
        writer.close();
    }
}
