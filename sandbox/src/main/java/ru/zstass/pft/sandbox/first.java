package ru.zstass.pft.sandbox;

public class first {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Stas");

        Double l = 8.0;
        System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l));

        Double a = 4.0;
        Double b = 6.0;
        System.out.printf("Площадь прямоуголника со сторонами %s и %s равна %s%n", a, b, area(a, b));
    }

    private static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    private static double area(Double len) {
        return len * len;
    }

    private static double area(Double a, Double b) {
        return a * b;
    }
}