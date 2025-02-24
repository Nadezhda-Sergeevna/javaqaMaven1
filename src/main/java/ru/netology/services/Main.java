package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        FreelanceService service = new FreelanceService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        System.out.println("Expected: " + expected + ", Actual: " + actual);
    }
}
