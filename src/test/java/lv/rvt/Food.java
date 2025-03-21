package lv.rvt;

public class Food extends Food100g {
    private double totalProtein;
    private double totalFat;
    private double totalCarbs;
    private double totalKcal;

    public Food(String name, double proteinPer100g, double fatPer100g, double carbsPer100g, double kcalPer100g, double quantity) {
        super(name, proteinPer100g, fatPer100g, carbsPer100g, kcalPer100g);
        this.totalProtein = calculateTotalProtein(quantity);
        this.totalFat = calculateTotalFat(quantity);
        this.totalCarbs = calculateTotalCarbs(quantity);
        this.totalKcal = calculateTotalKcal(quantity);
    }

    public double getTotalProtein() {
        return totalProtein;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public double getTotalCarbs() {
        return totalCarbs;
    }

    public double getTotalKcal() {
        return totalKcal;
    }

    public double calculateTotalProtein(double quantity) {
        return (getProteinPer100g() / 100.0) * quantity;
    }

    public double calculateTotalCarbs(double quantity) {
        return (getCarbsPer100g() / 100.0) * quantity;
    }

    public double calculateTotalFat(double quantity) {
        return (getFatPer100g() / 100.0) * quantity;
    }

    public double calculateTotalKcal(double quantity) {
        return (getProteinPer100g() * 4 + getCarbsPer100g() * 4 + getFatPer100g() * 9) * (quantity / 100.0);
    }
}