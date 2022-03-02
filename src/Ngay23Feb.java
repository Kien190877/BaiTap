public class Ngay23Feb {
    public static void  main(String[] args) {
        // 1. kieu du lieu nguyen thuy (premitive type)
        // String (chuổi)
        // int, long (số nguyên, là số không có phần thập phân)
        // float, double (số thực, có phần thập phân)
        // boolean (chí có 2 miền giá trị: Đúng/Sai)
        // char (kiểu ký tự)

        // khai báo biến, chi có biến String và char mới có dấu nháy, String thì dấu nháy đôi, char thì dấu nháy đơn ...
        // khi khai báo, mà có dòng đỏ phía dưới là error syntax ...
        String name = "trà quang kien";
        String address = "23 Hoang Duc Luong";
        char code = 'K';
        int age = 29;
        int myPhone = 209035135;

        // phương thức
        // Ctrl + P: kiểm tra kiểu dữ liệu truyền vào phương thức
        System.out.println("ho ten: " + name);
        System.out.println("dia chi: " + address);
        System.out.println("bi danh: " + code);
        System.out.println("tuoi: "+ age);
        System.out.println("so dien thoai: "+ myPhone);

        //2. Toán tử
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println("ket qua cong " + c);
        // làm thế nào để tăng giá trị a lên thành 6 ?
        a = a + 1;
        // neu a=5, kqua a =6
        a +=1;
        // neu a=5, kqua a =6
        a++;
        // neu a=5, kqua a =6
        --a;
        // neu a=5, kqua a =4
        System.out.println(a);
    dgagasdgsa
    }
}