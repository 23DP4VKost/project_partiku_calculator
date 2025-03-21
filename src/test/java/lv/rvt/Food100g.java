package lv.rvt;

public class Food100g {

    private String name;
    private double proteinPer100g;
    private double fatPer100g;
    private double carbsPer100g;
    private double kcalPer100g;
    
    public Food100g(String name, double proteinPer100g, double fatPer100g, double carbsPer100g, double kcalPer100g) {
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
}
