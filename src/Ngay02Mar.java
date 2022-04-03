public class Ngay02Mar {
    public static void main(String[] args) {

        Animal meo = new Animal("2","0.5");

        System.out.println("Con Meo: " + meo);
        System.out.println("Weight: " + meo.weight);
        System.out.println("Height: " + meo.height);

        Car toyota = new Car("xang","7 cho");
        System.out.println("Xe: "+ toyota);
        System.out.println("dong co: "+ toyota.dongco);
        System.out.println("loai xe: " + toyota.loaixe);

    }
}
class Animal {
    String weight;
    String height;

    //Phương thức khởi tạo: Constructor - nếu tên biến giống nhau, thì dùng phương thức: this.biến

    public Animal(String weight,String height){
        this.weight = weight;
        this.height = height;
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