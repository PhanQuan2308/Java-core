package handleExeption;

// cac buoc de custom 1 exeption: 1. Ke thua tu Exeption
//                                2. Viet cac constructor: constructor mac dinh, constructor voi message, constructor voi thong diep va nguyen nhan
//
//
//

public class CustomCheckedExeption extends  Exception{
    public CustomCheckedExeption(){
        super();
    }
    public CustomCheckedExeption(String message){
        super(message);
    }
    public CustomCheckedExeption(String message, Throwable cause){
        super(message, cause);
    }
    public CustomCheckedExeption(Throwable cause){
        super(cause);
    }

    public static void checkValue(int value) throws CustomCheckedExeption{
        if(value < 0){
            throw new CustomCheckedExeption("Gia tri khong duoc am");
        }
    }

    public static void main(String[] args) {
        try {
            checkValue(-1);
        }catch (CustomCheckedExeption e){
            System.out.printf("Bat ngoai le:" + e.getMessage());
        }
    }
}
