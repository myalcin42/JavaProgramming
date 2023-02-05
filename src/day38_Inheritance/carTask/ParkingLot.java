package day38_Inheritance.carTask;

public class ParkingLot { //eğer iki class arasında inheritance ilişkisi varsa IS A relation ilişkisi oluşur ama bir classa ait metot ya da objeler başka bir class içerisinde kullanılıyorsa ve bu classlar parent ve child class değilse HAS A relation ilişkisi oluşur burada toyota classı ve parking lot classı arasında has a relation ilişkisi vardır yani ParkingLot HAS A Toyota

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "grey", 123456);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "red", 0); // ParkingLot HAS A Tesla

        BMW bmw = new BMW("X5", 2020, 67350, "black", 12000);
        //ParkingLot HAS A BMW

        toyota.start(); //Twist the key to ignition to start Toyota Camry
        tesla.start(); //Say "start" to start Tesla Model S
        bmw.start(); //Call mechanic to jump start BMW X5
        //method overriding: one method with different implementations
    }


}
