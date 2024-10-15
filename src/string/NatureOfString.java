package string;

// la lop bieu dien chuoi:
//      + khong the thay doi sau khi khoi tao
//      + co 2 cach tao string tao string: 1. Tao truc tiep dung "", neu gia tri da ton tai thi tai su dung
//                                         2. Dung new (tao ra gia tri moi luu trong heap)
public class NatureOfString {
    public static void main(String[] args) {

        // khong the thay doi gia tri, va String Pool tai su dung gia tri
        String name = "Quan";
        name.concat("Phan");
        System.out.println(name );

    }
}
