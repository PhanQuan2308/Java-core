package handleExeption;

// Throw: nem ngoai le cu the tu 1 phuong thuc hoac khoi lenh, khi gap loi trong qua trinh chay code,
//        chuong trinh sẽ chuyen sang catch va thang catch  se nhan ngoai le tu thang throws da duoc dinh nghia truoc do.
//       + khi co ngoai le xay ra chuong trinh lap tuc dung lai

// Throws: khai báo rằng một phương thức có thể ném ngoại lệ, buộc phương thức gọi nó phải xử lý ngoại lệ.


public class ThowVsThows {

    public static void main(String[] args) {

        try {
            // Gọi phương thức có thể ném ngoại lệ
            checkAge(15);

            // khi loi checkAge xay ra thi catch se bat duoc loi tu IllegalArgumentException va tra ve ngoai le tu throw new IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Ngoại lệ đã bắt được: " + e.getMessage());


        } catch (Exception e) {
            System.out.println("Ngoại lệ kiểm tra đã bắt được: " + e.getMessage());
        }
    }

    // Sử dụng throws để khai báo phương thức có thể ném ngoại lệ
    public  static  void  checkAge(int age) throws  Exception{
        if(age<18){
            throw  new IllegalArgumentException("Tuoi phai tu 18 tro len");
        }

        if(age > 100){
            throw  new Exception("Tuoi không được vượt quá 100.");
        }
        System.out.printf("Tuoi hop le");
    }
}
