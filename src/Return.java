import java.security.PublicKey;

public class Return {
    //Su dung Return keyword ....
    //1. trả về giá trị thực hiện bởi một phương thức khi nó kết thúc ..
    //2. kết thúc phương thức ..
    // Return: không phải là dòng lệnh cuối cùng trong một phương thức, nhưng nó phải là lệnh được thực thi cuối cùng trong phương thức đó.
    // Đối với phương thức kiểu trả về là "Void" thì Return;
    // Đối với phương thức kiển trả về không phải là "Void", có thể là "Int" ... thì Return "biến";

    public void sum(int a, int b){
        int c = a + b;
        if (c%2 == 0){
            return;
        }
        System.out.print(c);
    }
}
