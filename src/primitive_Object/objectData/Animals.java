package primitive_Object.objectData;

// Object data type la cac Object trong java. Bao gom cac class do nguoi dung dinh nghia hoac cac wrapper class co san trong java.
//    + co phuong thuc di kem, khi khoi tao doi tuong moi thi cac bien tham chieu khong luu gia tri
//      ma chi tham chieu den dia chi chua vung nho, hieu xuat kem.
//    + co ho tro unboxing va autoboxing.
//    + ArrayList, HashMap,... khong luu kieu du lieu nguyen thuy ma chi luu kieu du lieu Object

public class Animals {

    // String o day la Object class
    String name;

    public Animals(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: "+ name;
    }
}
