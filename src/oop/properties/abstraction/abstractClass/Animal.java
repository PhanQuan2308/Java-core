package oop.properties.abstraction.abstractClass;

// chi tap trung vao cac chi tiet và hành vi của đoi tuong ma khong can cho biet chi tiet trien khai
//   + class con kế thua bat buoc phai trien khai phuong thuc truu tuong
//   + co ca phuong thuc truu tuong va phuong thuc co trinh trien khai
//   + 1 class con chỉ kế thừa đc 1 abstract class

public abstract class Animal {
    public abstract void eat();
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
