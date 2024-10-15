package primitive_Object.changeTypeData;

public class BoxingUnBoxxingDemo {
    public static void main(String[] args) {
        int num = 10;

        // AutoBoxing chuyen du lieu nguyen thuy sang Object
        Integer autoBoxing = num;

        //UnBoxing chuyen du lieu Object sang nguyen thuy
        int unBoxing = autoBoxing;

        System.out.println("Autoboxing:" + autoBoxing.toString());
        System.out.printf("UnBoxing:" + unBoxing);
    }
}
