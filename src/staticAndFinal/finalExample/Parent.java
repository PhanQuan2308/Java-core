package staticAndFinal.finalExample;

// khai bao 1 bien hoac 1 phuong thuc khong the thay doi sau khi khoi tao
//      + khong ghi đè, không kế thừa

class Parent {
    public final void display() {
        System.out.printf("This is final method");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
    }
}

