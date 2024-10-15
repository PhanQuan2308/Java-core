package oop.classInstaince;

// la mot doi tuong cua class duoc tao ra bằng từ new

public class Instance extends Class {
    public Instance(String name, int age){
        super(name, age);
    }

    public static void main(String[] args) {
        Class c = new Instance("Vu", 24);
        System.out.printf(c.toString());
    }
}
