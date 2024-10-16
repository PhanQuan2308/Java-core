package oop.properties.abstraction.interfaces;

// dinh nghia 1 tap hop cac phuong thuc nhung khong cung cap phan trien khai
// chi tiet nhưng phương thức default va static van co phan trien khai
// + vi du cung la cac phuong thuc thanh toan, ... tinh tien trong interface ma zalo va momo co the trien khai lai theo cach rieng

 interface Vehicle {
    void start();

    default void stop(){
        System.out.println("stop");
    }

}
class Car implements Vehicle{

    @Override
    public void start() {
        System.out.printf("Car start");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}