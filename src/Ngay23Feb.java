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

        //Gia su a=0, làm thế nào để tăng giá trị a lên 1 đơn vị ?
        //có các cách tăng a thêm 1 đơn vị:
        //a = a + 1; hoặc là: a += 1;
        //a++;:
        //++a:
        // Tương tự cho các phép trừ ... muốn trừ giá trị b xuống 1 đơn vị
        // b = b+1; hoặc là : b-=1;
        // b --;
        // --b;


//        int a = 5;
//        a +=2;
//        System.out.println("gia tri cua a: "+  a);
//        int b =4;
//        b++;
//        System.out.println("Gia tri cua b: "+b);
//        int c =9;
//        ++c;
//        System.out.println("Gia tri cua c: "+c);
//        int d=8;
//        --d;
//        System.out.println("Gia tri cua d: "+d);
//        int g=8;
//        g--;
//        System.out.println("Gia tri cua g: "+g);
//        int h=8;
//        h-=1;
//        System.out.println("Gia tri cua h: "+h);
//        int x = 11;
//        x -=4;
//        System.out.println("Gia trị của x là: "+x);

        // Vd y = 3; nếu ++y voi gtri 4, y voi gtri 4. Tong la 8
        int y=3;
        int ketQua1 = ++y + y;
        System.out.println("ket qua 1: " + ketQua1);

        // Vd k = 4;  k++ gia tri 4, k gtri 5. Tong la 9
        int k=4;
        int ketQua2 = k++ + k;
        System.out.println("ket qua 2: " + ketQua2);

        // Vd XM = 3; nếu --XM voi gtri 2, XM voi gtri 2. Tong la 4
        int XM=3;
        int ketQua3 = --XM + XM;
        System.out.println("ket qua 3: " + ketQua3);

        // Vd XL = 4;  XL-- gia tri 4, XL gtri 3. Tong la 7
        int XL=4;
        int ketQua4 = XL-- + XL;
        System.out.println("ket qua 4: " + ketQua4);


    }
}