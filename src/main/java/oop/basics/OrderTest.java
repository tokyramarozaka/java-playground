package oop.basics;

import java.util.List;

public class OrderTest {
    public static void main(String[] args) {
        Order myOrder = new Order("Kankuro", List.of(
           new OrderItem(1, "Milktea", 10, 1000),
           new OrderItem(2, "Matcha with pearls", 5, 13_000),
           new OrderItem(3, "Butter chicken", 2, 10000)
        ));

        System.out.println(myOrder.getGrandTotal());// value expected ?
    }
}
