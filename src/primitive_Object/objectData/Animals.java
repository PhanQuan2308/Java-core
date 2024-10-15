package primitive_Object.objectData;

// Object data type la cac Object trong java. Bao gom cac class do nguoi dung dinh nghia hoac cac wrapper co san.
//    + co phuong thuc di kem, khi khoi tao doi tuong moi thi cac bien tham chieu khong luu gia tri
//      ma chi tham chieu den dia chi chua vung nho.
//    + co ho tro unboxing va autoboxing.

public class Animals {
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
