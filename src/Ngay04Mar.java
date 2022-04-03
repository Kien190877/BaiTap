public class Ngay04Mar {

    public static void main(String[] args) {

        //Tạo ra Object
        Animall meo = new Animall();
        meo.weight ="4";
        meo.height = "12";

        meo.showInfor();

    }
}
class Animall{
    String weight;
    String height;

    //tạo function
    public void showInfor(){
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
    }

}

