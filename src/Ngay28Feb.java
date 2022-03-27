public class Ngay28Feb {
    public static void main(String[] args) {

//        //Vong lap If ... Else ....
//
//        int x = 5;
//        if (x % 2 == 0) {
//            System.out.println("X la só chẵn");
//        } else {
//            System.out.println("X là số lẽ");
//        }
//
//
//        int day = 9;
//        if (day == 1) {
//            System.out.println("day la ngay CN");
//        } else if (day == 2) {
//            System.out.println("day la thu hai");
//        } else if (day >= 3 && day <= 7) {
//            System.out.println("day la ngay trong tuần từ thu 3 den thu 7");
//        } else {
//            System.out.println("X không thoa");
//        }
//
//        //Toán tử logic trong java: And(&&), Or(||), Not(!)
//        //Toán tử gán: =, +=, -=, *=, /=
//        //Toán tử trong quan hệ: >, <, >=, <=, ==, !=
//
//        String a = "XX";
//        int thang = 18;
//        if (thang >= 1 && thang <= 12) {
//            System.out.println("Thang trong nam hop ly");
//        } else if ((thang > 12 || thang == 0) && a == "XX") {
//            System.out.println("Tháng không hợp lý trong nam");
//        }
//
//
//        //Su dung Return keyword ....
//        //1. trả về giá trị thực hiện bởi một phương thức khi nó kết thúc ..
//        //2. kết thúc phương thức ..
//        // Return: không phải là dòng lệnh cuối cùng trong một phương thức, nhưng nó phải là lệnh được thực thi cuối cùng trong phương thức đó.
//        // Đối với phương thức kiểu trả về là "Void" thì Return;
//        // Đối với phương thức kiển trả về không phải là "Void", có thể là "Int" ... thì Return "giá trị trả về";
//        // break keyword ....dùng để dừng vòng lặp ...
//
//        for (int i = 0; i <= 8; i++) {
//            if (i == 5) {
//                System.out.println("Exit loop at " + i);
//                break;
//            }
//            System.out.println("xuat gia tri i: " + i);
//        }
//
//        // break trong vòng lặp lồng nhau ...
//
//        for (int aa = 1; aa <= 9; aa++) {
//            for (int bb = 3; bb <= 10; bb += 2) {
//                if (aa == 4 && bb == 7) {
//                    System.out.println("giá trị aa " + aa + ", giá trị bb: " + bb);
//                    break;
//                }
//            }
//            System.out.println("gia tri aa " + aa);
//        }

//        // Vòng lặp while: lặp lại đoạn chương trình chừng nào điều kiện còn thỏa mãn.
//        int n = 100;
//        float sum = 0;
//        int i = 1;
//        while (i < n) {
//            sum += (float) 1 / i;
//            i++;
//            System.out.println("gia tri i " + i + "gia tri sum " + sum);
//        }
//        System.out.println("Ket qua cuoi cung: " + sum);
//
//        //dùng while để xuất từng ký tự ....
//        String msg = "Hello world";
//        int x =0;
//        while (x < msg.length()){
//            System.out.println(msg.charAt(x));
//            x++;
//        }

//        //dùng do-while : sử dụng khi muốn chương trình thực hiện ít nhất một lần
//        //do {nội dung cần lặp  while (điều kiện); } ...
//
//        int i = 0;
//        int n = 3;
//        do {
//            System.out.println("we are in do ... while: vòng lặp thực hiện ít nhất 1 lần");
//            System.out.println("gia tri i neu i < n, vòng lặp sẽ dừng: " + i);
//            i++;
//        } while (i < n) ;

        //Vòng lặp rẽ nhánh : switch-cases
        //biến của giá trị case phải trùng với biến khai báo trước đó (dk)
        //chú ý phải đặt lệnh break; vì nếu không sẽ thực hiện ở các case dù case đó thỏa hay không thỏa  ...

        int dk = 3;
        switch (dk) {
            case 1:
                //do something in this case
                System.out.println("You are in case 1");
                break;
            case 2:
                //do something in this case
                System.out.println("You are in case 2");
                break;
            case 3:
                //do something in this case
                System.out.println("You are in case 3");
                break;
            default:
                System.out.println("You are not in any case ?");
                break;
        }

        //đặt biến là kiểu chuối string ...

        String dkk = "Khuya";
        switch (dkk) {
            case "Sang":
                //do something in this case
                System.out.println("Chuc buoi sang tot lanh ");
                break;
            case "Trua":
                //do something in this case
                System.out.println("Buoi Trua vui ve");
                break;
            case "Toi":
                //do something in this case
                System.out.println("Chuc buoi toi hanh phuc");
                break;
            default:
                System.out.println("Khong co Buoi nao la thoa dieu kien ?");
                break;
        }


    }
}