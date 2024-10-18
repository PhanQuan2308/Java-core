package handleExeption;

// Checked exception là những ngoại lệ mà trình biên dịch yêu cầu phải được xử lý. Nghia la khi khai bao 1 phuong thuc co kha nang bi loi,
//                      thi phai xu ly trong try - catch va thow ngoai le.
//

// Unchecked exeption la nhung ngoai le khong bat buoc xu ly khi dang trong trinh bien dich. Chi khi runtime thi moi nem ngoai le.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExeption {
    public static void main(String[] args) {
        try {
            // khi ma dung FileReader thi chuong trinh bat buoc ban phai tao try/catch khong thi khong chay duoc
            File file = new File("non_existent.txt");
            FileReader fr = new FileReader(file);
        }catch (FileNotFoundException e) {
            throw new RuntimeException("Da xay ra loi:" + e.getMessage());
        }

        // xay ra loi khi chuong trinh bat dau chay, (vi tri thu 5 nam ngoai kich thuoc cua mang)
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);

    }
}
