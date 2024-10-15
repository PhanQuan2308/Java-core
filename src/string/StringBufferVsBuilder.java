package string;

// do la String la bat bien nên khi nối chuỗi nó se tạo nhiều đối tượng mới làm giảm hiệu suất
// StringBuffer: + thay doi chuoi ma khong tao doi tuong moi
//               + dong bo hoa, an toan da luong, cham hon StringBuilder, nên dùng trong đa luồng vì đồng bộ
//
// StringBuilder: + thay doi chuoi ma khong tao doi tuong moi
//                + bat dong bo, khong an toan, nhanh, chi nen dung voi đơn luồng


public class StringBufferVsBuilder {
    public static void main(String[] args) {

        //StringBuilder
        StringBuilder students = new StringBuilder("List of students: ");
        for(int i = 1; i <= 5; i++ ){
            students.append("student ").append(i);
            if(i < 5) students.append(",");
        }
        System.out.println(students.toString());

        //StringBuffer
        StringBuffer steps = new StringBuffer("Steps: ");
        steps.append("Step1, ");
        steps.append("Step2, ");
        steps.append("Step3 ");
        System.out.println(steps.toString());
    }
}
