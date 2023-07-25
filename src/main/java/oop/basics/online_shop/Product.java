package oop.basics.online_shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Product {
    private String name;
    private String description;
    private float unitPrice;


    public Product(String name, String description, float unitPrice) {
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        if(unitPrice > 0) {
            this.unitPrice = unitPrice;
        }else{
            System.out.println("unit price is invalid");
        }
    }

    public abstract float getTotalPrice();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.unitPrice, unitPrice) == 0 && Objects.equals(name, product.name) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, unitPrice);
    }

    @Override
    public String toString() {
        return "=".repeat(30) + "\n" +
                "name='" + name + "'\n" +
                "description='" + description + "'\n" +
                "unitPrice=" + unitPrice + " Ar.";
    }
}
