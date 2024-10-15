package string;

// co 3 cach so sanh:
//     + equals(): so sanh noi dung cua 2 chuoi, dung tra ve true, sai tra ve false
//     + toan tu "==" : kiem tra xem 2 bien co cung tham chieu den cung 1 doi tuong.
//     + compareTo(): so sanh theo thứ tự từ điển, nghĩa là so sánh từng kí tự trong chuỗi


public class CompareString {
    public static void main(String[] args) {

        // dung equals()
        String name1 = "Quan";
        String name2 = "Quan";
        System.out.println(name1.equals(name2));

        // dung ==
        String address1 = "Bac Ninh";
        String address2 = "Bac Ninh";
        String address3 = new String("Bac Ninh");
        System.out.println("Result1:" + (address1 == address2));
        System.out.printf("Result2:" + (address2 ==  address3));
    }

}
