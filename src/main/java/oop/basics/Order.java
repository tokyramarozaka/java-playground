package oop.basics;

import java.util.List;

public class Order {
    private String customerName;
    private List<OrderItem> orderItems;

    public Order(String customerName, List<OrderItem> orderItems) {
        this.customerName = customerName;
        this.orderItems = orderItems;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double getGrandTotal(){
        double grandTotal = 0.0;

        for (int i = 0; i < orderItems.size(); i++) {
            grandTotal += orderItems.get(i).getTotal();
        }

        return grandTotal;
    }
}
