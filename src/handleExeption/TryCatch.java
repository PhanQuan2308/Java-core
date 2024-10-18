package handleExeption;

// Try-catch: la cach xu ly ngoai le pho bien nhat. Try se xu ly logic neu co loi xay ra thi catch se bat loi.
//            Dung try-catch khi ban can xu li ngoai le nhung khong can dong tai nguyen

// Try-catch-resource: duoc su dung de quan li tu dong cac tai nguyen can duoc dong sau khi su dung xong (như file, connection, input/output stream).
//                     Tranh do ri tai nguyen, tai nguyen se dong lai ngay  ca khi có ngoai le xay ra.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {

    }

    public static  void noTryCatchResource(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("example.txt"));

            // khi nem ngoai le thi chuong trinh ket thuc nhung tai nguyen khong duoc dong lai
            throw new RuntimeException("Co loi xay ra, ket thuc chuong trinh");
        }catch (IOException e){
            System.out.printf("Da co loi xay ra:" + e.getMessage()); ;
        }finally {

            // tai day dung method close() de dong chuong trinh thu cong.
            if(br != null){
                try {
                    br.close();
                }catch (IOException e){
                    System.out.printf("Loi dong tai nguyen: " + e.getMessage());
                }
            }
        }
    }

    public static void tryCatchResource(){
        // cach truyen doi so vao try de tu dong dong tai nguyen
        try(BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            throw  new RuntimeException("Da co loi xay ra, chuong trinh ket thuc ");
        }catch (IOException e){
            System.out.printf("Da co loi xay ra:" + e.getMessage());
        }

        // tai nguyen dong lai ma khong can finally
    }
}
