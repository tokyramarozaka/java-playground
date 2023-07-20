package oop.basics.online_shop;

import java.util.ArrayList;
import java.util.List;

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
    }

    public void displayProducts(){
        this.products.forEach(product -> System.out.println(product));
    }

    /** Affiche le nom et le prix total de tous les produits dans le magasin */
    /**
     * Avec un seul nom de méthode, Java peut executer deux implementations
     * différentes, qu'il choisit lors de l'execution : c'est du Polymorphisme
     * dynamique, late binding.
     *
     * Lorsqu'on a deux méthodes du même nom, mais de paramètres différents,
     * on a du polymorphisme statique, OU de la surcharge de méthode OU
     * du EARLY BINDING.
     */
    public void showNamesAndTotalPrices(){
        // TODO
    }

    public static void main(String[] args) {
        Electronics pc = new Electronics(
                "Dell Precision 5530",
                "Core i9 8th gen. 16Gb"
                +" of RAM. Nvidia Graphics 1050Ti and Intel Graphics",
                4_000_000,
                "DELL", 3);
        Clothing jacket = new Clothing("Rounded collar jacket",
                "A warm jacket for the winter.",
                75_000, "L", "Cotton");

        Shop shop = new Shop(new ArrayList<>());
        shop.addProduct(pc);
        shop.addProduct(jacket);

        shop.displayProducts();
        // shop.showNamesAndTotalPrices();

        /* ================================================================================= */
//        Product pcDuplicate = new Electronics(
//                "Dell Precision 5503",
//                "Core i9 8th gen. 16Gb of RAM. Nvidia Graphics 1050Ti and Intel Graphics",
//                4_000_000,"DELL", 3);
//
//        System.out.println(pc.equals(pcDuplicate));// true or false
        //System.out.println(shop.products.contains(pcDuplicate)); // true or false ?
    }
}
