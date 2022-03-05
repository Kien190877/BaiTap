public class Ngay23Feb {
    public static void  main(String[] args) {
        // 1. kieu du lieu nguyen thuy (premitive type)
        // String (chuổi)
        // int, long (số nguyên, là số không có phần thập phân) .. int (ap dung cho so nguyen duoi 2 ty), long tu 2 ty tro len ...
        // float, double (số thực, có phần thập phân)
        // boolean (chí có 2 miền giá trị: Đúng/Sai)
        // char (kiểu ký tự)

        // khai báo biến, chi có biến String và char mới có dấu nháy, String thì dấu nháy đôi, char thì dấu nháy đơn ...
        // khi khai báo, mà có dòng đỏ phía dưới là error syntax ...

//        String hoTen = "trà quang kien";
//        String address = "23 Hoang Duc Luong";
//        char code = 'K';
//        int age = 29;
//        int myPhone = 209555135;

        // phương thức
        // Ctrl + P: kiểm tra kiểu dữ liệu truyền vào phương thức
        // Ctrl + space: gợi ý code ...
        // Ctrl + "/": Muốn chuyển các đoạn code thành các đoạn comments & ngược lại.

//        System.out.println("ho ten: " + hoTen);
//        System.out.println("dia chi: " + address);
//        System.out.println("bi danh: " + code);
//        System.out.println("tuoi: "+ age);
//        System.out.println("so dien thoai: "+ myPhone);


        //2. Toán tử

        // Gia su a=0, làm thế nào để tăng giá trị a lên 1 đơn vị ?
        // có các cách tăng a thêm 1 đơn vị:
        // a = a + 1; hoặc là: a += 1;
        // a++;
        // ++a:

        int a = 5;
        a+=1;
        System.out.println("gia tri cua a: "+  a);

    }
}