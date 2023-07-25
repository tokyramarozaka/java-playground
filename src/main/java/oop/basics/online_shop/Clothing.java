package oop.basics.online_shop;

import java.util.Objects;

public class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, String description, float unitPrice) {
        super(name, description, unitPrice);
    }

    public Clothing(String name, String description, float unitPrice, String size, String material) {
        super(name, description, unitPrice);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // boiler plate code : code qui se repete très souvent, avec peu, voire aucune variation.
    @Override
    public float getTotalPrice() {
        float total = this.getUnitPrice();

        switch (this.size) {
            case "L", "XL", "XXL" -> total += 0.05 * this.getUnitPrice();
        }
        if ("cotton".equalsIgnoreCase(this.getMaterial())) {
            total += 0.1 * this.getUnitPrice();
        }
        return total;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Clothing other = (Clothing) obj;
        return this.size.equals(other.getSize())
                && this.material.equals(other.getMaterial());
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "size = '" + this.size + "'\n"
                + "material ='" + this.material + "'\n"
                + "=".repeat(30);
    }
}
