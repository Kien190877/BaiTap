import java.util.Locale;

public class Ngay23Feb {
    public static void  main(String[] args) {

        // Cách phân biệt Print() va Println() trong java.
        // Print() là sau khi in ra màn hình thì con trỏ nằm ngày cuối dòng lệnh và kết quả tiếp theo sẽ nằm liền kề ngay con trỏ
        // Println() là sau khi in ra màn hình thì con trỏ nằm xuống dòng và kết quả tiếp theo sẽ ở dòng kế tiếp (không cùng dòng kqua trước đó)

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

//        // Vd y = 3; nếu ++y voi gtri 4, y voi gtri 4. Tong la 8
//        int y=3;
//        int ketQua1 = ++y + y;
//        System.out.println("ket qua 1: " + ketQua1);
//
//        // Vd k = 4;  k++ gia tri 4, k gtri 5. Tong la 9
//        int k=4;
//        int ketQua2 = k++ + k;
//        System.out.println("ket qua 2: " + ketQua2);
//
//        // Vd XM = 3; nếu --XM voi gtri 2, XM voi gtri 2. Tong la 4
//        int XM=3;
//        int ketQua3 = --XM + XM;
//        System.out.println("ket qua 3: " + ketQua3);
//
//        // Vd XL = 4;  XL-- gia tri 4, XL gtri 3. Tong la 7
//        int XL=4;
//        int ketQua4 = XL-- + XL;
//        System.out.println("ket qua 4: " + ketQua4);


//        // phép chia lấy nguyên, vd : a/b
//        // phép chia lấy dư, vd: a%b
//        // muốn kết quả là số thực (có cả phần trăm, vừa khai báo biến float, vừa gán biến vào tử hoặc mẫu ...
//
//        int bien =108;
//        int bien1 = 25;
//        float bien2 = bien/bien1;
//        float bien3 = bien%bien1;
//        float bien4 = (float)bien/bien1;
//        float bien5 = bien/(float)bien1;
//        System.out.println(bien2);
//        System.out.println(bien3);
//        System.out.println(bien4);
//        System.out.println(bien5);
//
//        // chu y trong phương thức println(). Nếu có "character", thì kết quả là một chuỗi, và "+" là phép gán giữa các phần tử ...
//        // nếu không có "character" thì "+" là toán tử để tính toán giữa các phần tử với nhau ...
//
//        System.out.println("Ket qua, đây là một chuỗi: "+ bien1 + ((float)bien/bien1));
//        System.out.println(bien1 + ((float)bien/bien1));
//
//        // phương thức in ra màn hình: println là kết quả sẽ xuống dòng, còn print là kết quả đứng ngay cạnh kết quả trước đó trên cùng 1 dòng.

        // Toán tử so sánh

//        int bien6 = 10;
//        int bien7 = 10;
//        System.out.println("bien6 > bien7 ? " + (bien6>bien7));
//        System.out.println("bien6 <= bien7 ? " + (bien6<=bien7));
//        System.out.println("bien6 == bien7 ? " + (bien6==bien7));
//        System.out.println("bien6 != bien7 ? " + (bien6!=bien7));

        // Toán tử gán ?
        // =: phép gán
        // +=, -=: cộng, trừ giá trị rồi gán
        // *=, /=: nhân, chia rồi gán lại
        // %=: chia lấy dư rồi gán lại kết quả nhận được

//        int bien9 = 10;
//        int bien8 = 15;
        // bien8 = bien8 + bien9 (viết ngắn gọn: bien8 += bien9, và tương tự cho các phép tính khác ...)
//        bien8 += bien9;
//        System.out.println("bien8 += bien9: ket qua la 25:  " + bien8);
//        bien8 -= bien9;
//        System.out.println("bien8 -= bien9: ket qua la 5: " + bien8);
//        bien8 *= bien9;
//        System.out.println("bien8 *= bien9: ket qua la 150: "+ bien8);
//        bien8 /= bien9;
//        System.out.println("bien8 /= bien9: ket qua la 1: "+ bien8);
//        bien8 %= bien9;
//        System.out.println("bien8 %= bien9: ket qua la 1: "+ bien8);

        //String: dùng để lưu trữ chuỗi các ký tự
        //lấy độ dài chuỗi ký tự: length()
        //Viết hoa, viết thường chuỗi: toUpperCase(), toLowerCase(), ...
        //Các ký tự đặc biệt: '. ", \, /, \n, \t
        //Nối chuỗi ký tự, dùng toán tử nối: (+)
        //Lưu ý khi kết hợp giữa String với thứ khác ....

        String  msg = "Hello world";
        String name = "Quang Kien";
        System.out.println(msg);
        System.out.println(msg.length());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());

        //muốn tìm chữ "w" đứng vị trí thứ mấy trong chuối "hello world"
        System.out.println(msg.indexOf("w"));
        System.out.println(msg +" "+ name);

    }
}