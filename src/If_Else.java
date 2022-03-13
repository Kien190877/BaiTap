import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import static javax.management.Query.and;

public class If_Else {
    public static void  main(String[] args) {
        int x = 5;
        if (x %2 == 0) {
            System.out.println("X la só chẵn");
        } else  {
            System.out.println("X là số lẽ");
        }


        int day = 9;
        if (day == 1) {
            System.out.println("day la ngay CN");
        } else if (day == 2) {
            System.out.println("day la thu hai");
        } else if(day >=3 && day <=7){
            System.out.println("day la ngay trong tuần từ thu 3 den thu 7");
        } else {
            System.out.println("X không thoa");
        }

        //Toán tử logic trong java: And(&&), Or(||), Not(!)
        //Toán tử gán: =, +=, -=, *=, /=
        //Toán tử trong quan hệ: >, <, >=, <=, ==, !=

        String a = "monthx";
        int thang = 18;
        if (thang >=1 && thang <=12 ) {
            System.out.println("Thang trong nam hop ly");
        }  else if (thang >12 || thang == 0) {
            System.out.println("Tháng không hợp lý trong nam");
        }
    }
}
