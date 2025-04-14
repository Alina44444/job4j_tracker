package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return x - a;
    }

    public int divide(int a) {
        return x / a;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result + " sum");
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println(result + " multiply");
        result = minus(6);
        System.out.println(result + " minus");
        result = calculator.divide(2);
        System.out.println(result + " divide");
        result = calculator.sumAllOperation(8);
        System.out.println(result + " sumAllOperation");
    }
}