package staticAndFinal;

// de khai bao thuoc tinh hoac phuong thuc thuoc ve lop, khi khai bao thi tat ca co the dung duoc
//     + các phương thức static có thể gọi static nhưng không gọi được nonstatic nhưng nonstatic có the gọi cả 2
//     + khi nao dung: khi tao cac phuong thuc hoac biến dùng chung, tao ra cac hang so

public class Static {
    static  int staticVar = 10;
    int nonStaticVar = 20;

    static void staticMethod() {
        System.out.println("staticVar: " +  staticVar);
        // System.out.println("Non-static Variable: " + nonStaticVar); // Lỗi
    }
    void nonStaticMethod() {
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Non-static Variable: " + nonStaticVar);
        staticMethod();
    }

    public static void main(String[] args) {
        Static s1 = new Static();

        staticMethod();
    }
}
