package oop.basics;

public class TestEmployee {
    public static void main(String[] args) {
        Employee marc = new Employee(
                1,
                "RAZANAJATOVO",
                "Marc Herilala",
                10_000_000
        );
        System.out.println(marc);
    }
}