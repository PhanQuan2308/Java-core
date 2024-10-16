package memory;

// Stack:  + lưu trữ các biến cục bộ (local variables) và thông tin về các phương thức đang thực thi
//         + Khi một phương thức được gọi, một khung (frame) mới sẽ được tạo trên stack để lưu trữ các biến cục bộ của phương thức đó.
//         + Khi phương thức kết thúc, khung này sẽ bị xóa và bộ nhớ sẽ được giải phóng tự động.
//         + Khung nao tao cuoi cung thi se duoc xoa dau tien do quy tac LIFO
//         + lưu bien cuc bo duoc khai bao trong methob, constructor

// Heap:   + được sử dụng để lưu trữ các đối tượng (objects), instance variable và mảng (arrays). Tất cả các đối tượng được tạo bằng từ khóa new sẽ được lưu trữ trên heap.
//         + kich thuoc lon, co the mo rong
//         + Garbage Collector để tự động thu hồi bộ nhớ không còn sử dụng
//


public class StackAndHeap {

    // Biến thể hiện (Instance variable) - lưu trữ trên heap
    int instanceVar;

    public StackAndHeap(int value){
        this.instanceVar = value;
    }

    public void display(){
        // Bien cuc bo - luu vao stack
        int localVar = 10;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {

        // Bien tham chieu s1 và 10 luu vao stack, khi mà tạo bang tu khoa new thi instanceVar và new StackAndHeap  se luu vao heap,
        // s1 chỉ là tham chieu den gia tri cua StackAndHeap duoc luu trong heap.
        StackAndHeap s1 = new StackAndHeap(10);
        s1.display();

    }



}
