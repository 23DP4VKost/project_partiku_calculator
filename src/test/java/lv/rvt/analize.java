package lv.rvt;

public class analize {
    private String name;
    private double protein;
    private double carbs;
    private double fat;
    private double kcal;
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

    public double calculateKcal() {
        return (calculateCarbs()*4+calculateFat()*9+calculateProtein()*4);
    }
    
    public void setkCal(double kcal) {
        this.kcal = kcal;
    }
}
