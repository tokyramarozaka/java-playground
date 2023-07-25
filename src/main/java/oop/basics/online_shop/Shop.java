package oop.basics.online_shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    private List<Product> products;

    public Shop(){
        this.products = new ArrayList<>();
    }

    public Shop(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product toAdd){
        this.products.add(toAdd);
        this.products.add(0, toAdd);
    }

    public void displayProducts(){
        this.products.forEach(product -> System.out.println(product));
    }

    public void showNamesAndTotalPrices(){
        for (Product product : this.products) {
            System.out.println(product.getName() + " : " + product.getTotalPrice());
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop(new ArrayList<>());
        Electronics pc = new Electronics("Dell Precision 5530",
                "Core i9 8th gen. 16Gb of RAM. Nvidia Graphics 1050Ti and Intel Graphics",
                4_000_000,"DELL", 3
        );
        Clothing jacket = new Clothing("Rounded collar jacket",
                "A warm jacket for the winter.",
                75_000, "L", "Cotton");
        shop.addProduct(pc);
        shop.addProduct(jacket);

        Electronics pcDuplicate = new Electronics(
                "Dell Precision 5530",
                "Core i9 8th gen. 16Gb of RAM. Nvidia Graphics 1050Ti and Intel Graphics",
                4_000_000,"DELL", 3
        );

        System.out.println(shop.getProducts().contains(pcDuplicate));
        // Will return false unless you override the equals method
    }
}
