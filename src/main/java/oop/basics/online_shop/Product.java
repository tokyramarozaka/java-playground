package oop.basics.online_shop;

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
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "=".repeat(30) + "\n" +
                "name='" + name + "'\n" +
                "description='" + description + "'\n" +
                "unitPrice=" + unitPrice + " Ar.";
    }
}
