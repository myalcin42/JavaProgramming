package day33_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price;

    public static String OS = "IOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;


    public static void printModelAndPrice(){ // eğer böyle bir metotu static olarak oluşturmak istersem aşağıdaki print statement ifadesi hata verir çünkü model ve price instance variable olduğu için static metot bu variableları kabul etmez
        //System.out.println(model + " : " + price);
        //static members belongs to the class that is why class can not share the object members ( static methods in java does not accept instances
    }

    public void method1(){
        System.out.println(OS); // ama instance metotlar static variable kabul eder çünkü objeler classlardan gelir ve classa ait olan static memberları kabul eder ama static classa tabi olduğu için objeye tabi olan instance ları kabul etmez
    }

    public static void printOperatingSystem(){
        System.out.println(OS); // bu metot static variable olduğu için static metot oluşturulabilir bu metot sadece bir kopya oluşturur ve bütün objeler tarafından paylaşılır ikinci avantaj ise bu metotu çağırmak için bir objeye ihtiyaç yoktur direkt class içerisinde çağrılabilir çünkü static metot objeye bağlı değildir instance metot can be called through the objects because instance belongs to the objects
    }

}
