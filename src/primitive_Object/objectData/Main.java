package primitive_Object.objectData;

//

public class Main {
    public static void main(String[] args) {

        // animals1 va animals2 la cac doi tuong, cac doi tuong nay
        // chi tham chieu den dia chi vung nho cua Animal ma khong chua gia tri
        Animals animals1 = new Animals("Chicken");
        Animals animals2 = animals1;

        System.out.println(animals1.toString());
        System.out.println(animals2.toString());

    }
}
