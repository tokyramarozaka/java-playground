package oop.basics.online_shop;

public class Electronics extends Product {
    private String brand;
    private float weightInKg;

    public Electronics(String name, String description, float unitPrice, String brand,
                       float weightInKg) {
        super(name, description, unitPrice);
        this.brand = brand;
        this.weightInKg = weightInKg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(float weightInKg) {
        this.weightInKg = weightInKg;
    }

    public float getTotalPrice(){
        return this.getUnitPrice() + this.weightInKg * 15000;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "brand='" + brand + "'\n" +
                "weight=" + weightInKg + " Kg.\n"
                + "=".repeat(30);
    }
}
