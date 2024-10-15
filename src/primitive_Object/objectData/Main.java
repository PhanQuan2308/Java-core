package primitive_Object.objectData;

//

public class Main {
    public static void main(String[] args) {
        Animals animals1 = new Animals("Chicken");
        Animals animals2 = animals1;

        System.out.println(animals1.toString());
        System.out.println(animals2.toString());

    }
}
