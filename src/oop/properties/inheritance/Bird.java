package oop.properties.inheritance;

public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("Fly");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.move();
    }
}
