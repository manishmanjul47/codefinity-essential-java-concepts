package com.example;

public class Main {
     public static int area(int width, int height) {
        return width * height;
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        int rectArea = area(5, 10);
        double circleArea = area(3.0);
        double triangleArea = area(3.0, 4.0, 5.0);

        System.out.println("Rectangle area: " + rectArea);
        System.out.println("Circle area: " + circleArea);
        System.out.println("Triangle area: " + triangleArea);
    }
}