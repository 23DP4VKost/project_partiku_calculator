package lv.rvt;

public class analize {
    private String name;
    private double protein;
    private double carbs;
    private double fat;
    private int kcal;
    private double quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double calculateProtein() {
        return (protein / 100.0) * quantity;
    }

    public double calculateCarbs() {
        return (carbs / 100.0) * quantity;
    }

    public double calculateFat() {
        return (fat / 100.0) * quantity;
    }

    public int calculateKcal() {
        return (int) ((kcal / 100.0) * quantity);
    }
}
