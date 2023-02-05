package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("galaxy s19", "6 inches", 900,"White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gary");

        System.out.println(iphone); // Phone{brand='Apple', model='Iphone 12', size='6.7 inches', price= $1000.0, color='Black', has battery='true'}
        System.out.println(samsung); // Phone{brand='Samsung', model='galaxy s19', size='6 inches', price= $900.0, color='White', has battery='true'}
        System.out.println(nokia); // Phone{brand='Nokia', model='Brick', size='4 inches', price= $50.0, color='Gary', has battery='true'}

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("===========================================");

        samsung.call(911);
        samsung.text(1234556789);
        samsung.freeze();

        System.out.println("=======================================");

        nokia.call(4235454);
        nokia.text(222525);
        nokia.selfDefense();

        System.out.println("====================================");

        System.out.println(Iphone.hasBattery); // as we see static variable is also has been inherited(inherit edilen şeyler olduğu gibi inherit edilir tipi değiştirilemez yani static ise inherit edildiği yerde de static olur
    }
}
