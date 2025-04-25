package lv.rvt;


    public class Food extends Food100g {
        private double quantity;
    
        public Food(String name, double proteinPer100g, double fatPer100g, double carbsPer100g, double kcalPer100g, double quantity) {
            super(name, proteinPer100g, fatPer100g, carbsPer100g, kcalPer100g);
            
            this.quantity = quantity;
        }
    
        public double getQuantity() {
            return quantity;
        }
    
        public double calculateTotalProtein() {
            return (getProteinPer100g() * quantity) / 100.0;
        }
    
        public double calculateTotalCarbs() {
            return (getCarbsPer100g() * quantity) / 100.0;
        }
    
        public double calculateTotalFat() {
            return (getFatPer100g() * quantity) / 100.0;
        }
    
        public double calculateTotalKcal() {
            return (getKcalPer100g() * quantity) / 100.0;
        }
    }