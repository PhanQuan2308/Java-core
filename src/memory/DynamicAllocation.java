package memory;

// là quá trình cấp phát bộ nhớ cho các đối tượng và cấu trúc dữ liệu trong heap khi chương trình đang chạy (runtime).
//     + tao ra cac mang, cau truc du lieu linh hoat.
//     + cho phép chương trình yêu cầu bộ nhớ từ heap để lưu trữ các đối tượng (objects) và mảng (arrays) trong thời gian thực thi.
//     + thực hiện thông qua từ khóa new, ví dụ khi tạo 1 object bang tu khoa new thi se tao ra mang hoac object moi trong bo nho heap

public class DynamicAllocation {
    public void display() {
        System.out.println("Quan");
    }

    public static void main(String[] args) {

        // cap phat dong cho obj
        DynamicAllocation obj = new DynamicAllocation();

        // cap phat dong cho mang
        int[] arr = new int[10];

        obj.display();
        arr[0] = 1;

    }
}
