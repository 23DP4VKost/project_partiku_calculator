package lv.rvt;

public class Food {
    private String name;
    private double proteinPer100g;
    private double fatPer100g;
    private double carbsPer100g;
    private double kcalPer100g;

    public Food(String name, double proteinPer100g, double fatPer100g, double carbsPer100g, double kcalPer100g) {
        this.name = name;
        this.proteinPer100g = proteinPer100g;
        this.fatPer100g = fatPer100g;
        this.carbsPer100g = carbsPer100g;
        this.kcalPer100g = kcalPer100g;
    }

    public String getName() {
        return name;
    }

    public double getProteinPer100g() {
        return proteinPer100g;
    }

    public double getFatPer100g() {
        return fatPer100g;
    }

    public double getCarbsPer100g() {
        return carbsPer100g;
    }

    public double getKcalPer100g() {
        return kcalPer100g;
    }

    public double calculateTotalProtein(double quantity) {
        return (proteinPer100g / 100.0) * quantity;
    }

    public double calculateTotalCarbs(double quantity) {
        return (carbsPer100g / 100.0) * quantity;
    }

    public double calculateTotalFat(double quantity) {
        return (fatPer100g / 100.0) * quantity;
    }

    public double calculateTotalKcal(double quantity) {
        return (proteinPer100g * 4 + carbsPer100g * 4 + fatPer100g * 9) * (quantity / 100.0);
    }
}