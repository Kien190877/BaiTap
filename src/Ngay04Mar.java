public class Ngay04Mar {

    public static void main(String[] args) {

        //Tạo ra Object
        Animal meo = new Animal("5", "9");

        meo.showInfor();
    }

    static class Animal {
        String weight;
        String height;

        //constructor method - phương thức khởi tạo
        public Animal(String weight, String height) {
            this.weight = weight;
            this.height = height;
        }


        //tạo function - print properties
        public void showInfor() {
            System.out.println("Weight: " + weight);
            System.out.println("Height: " + height);
        }

    }
}

