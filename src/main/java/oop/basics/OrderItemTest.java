package oop.basics;

public class OrderItemTest {
    public static void main(String[] args) {
        OrderItem orderOne=new OrderItem(
                1,
                "red label",
                10,
                240_000
        );
        System.out.println(orderOne.getTotal());
    }
}