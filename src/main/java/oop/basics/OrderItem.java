package oop.basics;

public class OrderItem {
    private int id;
    private String description;
    private int quantity;
    private double unitPrice;

    public OrderItem(int id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice>0) {
            this.unitPrice = unitPrice;
        }
        else{
            System.out.println("erreur");
        }
    }
    public double getTotal(){
       return (quantity*unitPrice) ;
    }
}