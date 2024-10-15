package oop.properties.encapsulation;

// han che quyen truy cap vao cac thuoc tinh va phuong thuc tu ben ngoai.
//      + An di thong chi tiet cua 1 doi tuong, chi co the thao tac thong qua Getter va Setter, tang tinh bao mat.

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
