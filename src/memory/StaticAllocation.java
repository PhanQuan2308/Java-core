package memory;

// Sử dụng từ khóa static để khai báo các biến hoặc phương thức.
//    + diễn ra tại thời điểm biên dịch và bộ nhớ được duy trì trong suốt vòng đời của chương trình.
//    + khi ma chuong trinh bat dau chay thi tat ca thay doi cua static deu duoc cap nhat lai khi co thay doi
//    + duoc luu vao trong heap

public class StaticAllocation {

    //cap phat tĩnh bằng từ static
    static int staticCounter = 0;

    int instanceCounter = 0;

    public StaticAllocation() {
        // Tăng giá trị của biến tĩnh
        staticCounter++;

        instanceCounter++;

    }
    public void printCounters() {
        System.out.println("Static Counter: " + staticCounter);
        System.out.println("Instance Counter: " + instanceCounter);
    }

    public static void main(String[] args) {

        StaticAllocation sa1 = new StaticAllocation();
        sa1.printCounters();

        StaticAllocation sa2 = new StaticAllocation();
        sa2.printCounters();

    }
}
