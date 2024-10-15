package oop.properties.polymorphism;

// Overloading chi cho phep thay doi doi số truyền vào hoặc kiểu dữ lieu

public class Overloading {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.add(10, 20));
        System.out.println(o.add(10.1, 20.1));
    }
}
