package oop.classInstaince;

// Class la khuon mau thiet ke cho doi tuong. chua cac properties va cac method
//     +    khong thuc hien hanh dong cu the ma chi mo ta cac dac diem va hanh vi.


public class Class {
    String name;
    int age;

    public Class(){}

    public Class(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public  void setName(String name){
        this.name = name;
    }
    public  void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
