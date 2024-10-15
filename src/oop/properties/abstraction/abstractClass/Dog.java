package oop.properties.abstraction.abstractClass;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
