package ru.zstass.pft.sandbox;

public class First {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Stas");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + area(s));

        Rectangle r = new Rectangle(4.0,6.0);
        System.out.printf("Площадь прямоуголника со сторонами %s и %s равна %s%n", r.a, r.b, area(r));
    }

    private static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    private static double area(Square s) {
        return s.l * s.l;
    }

    private static double area(Rectangle r) {
        return r.a * r.b;
    }
}