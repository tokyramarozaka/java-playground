package oop.basics.online_shop;

public class Clothing extends Product {
    private String size;
    private String material;

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

    // boiler plate code : code qui se repete très souvent, avec peu
    // voire aucune variation.
    public float getTotalPrice() {
        float total = this.getUnitPrice();

        switch (this.size) {
            case "L", "XL", "XXL" -> total += 0.05 * this.getUnitPrice();
        }
        if ("cotton".equals(this.material)) {
            total += 0.1 * this.getUnitPrice();
        }
        return total;
    }
}
