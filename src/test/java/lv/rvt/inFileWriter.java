package lv.rvt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class inFileWriter {
    public static void FileWriting(ArrayList<Food> foodList, String filename) throws IOException {
    FileWriter writer = new FileWriter(filename);

    writer.append("Name| Total Protein (g)| Total Fat (g)| Total Carbs (g)| Total Kcal\n");
    for (Food food : foodList) {
        writer.append(food.getName()).append("|");
        writer.append(String.valueOf(food.getTotalProtein())).append("|");
        writer.append(String.valueOf(food.getTotalFat())).append("|");
        writer.append(String.valueOf(food.getTotalCarbs())).append("|");
        writer.append(String.valueOf(food.getTotalKcal())).append("\n");
    }

    writer.flush();
    writer.close();
    }
}

