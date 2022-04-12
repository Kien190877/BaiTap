public class Ngay02Mar {
    public static void main(String[] args) {

        //Tạo ra Object


        Car toyota = new Car("xang","7 cho");
        System.out.println("Xe: "+ toyota);
        System.out.println("dong co: "+ toyota.dongco);
        System.out.println("loai xe: " + toyota.loaixe);



    }
}


class Car{
    String dongco;
    String loaixe;
    public Car(String dongco, String loaixe){
        this.dongco = dongco;
        this.loaixe = loaixe;
    }
}