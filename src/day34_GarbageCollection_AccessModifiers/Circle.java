package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;
    //mesela bu şekilde arraylist set edilebilmesi için iki aşamaya ihtiyaç olursa mesela numbers.add(10) bu şekilde yapmaya çılışırsak compiler hata verir bu yüzden statik bloka ihtiyaç olur (yani tek bir adımda set edemeyeceğimiz yani initialize yapamayacağımız bir static variable olursa static blok kullanılır)

    public Circle(double radius){
        this.radius = radius;
       // pi = 3.14; // bu şekilde her obje oluşturduğumuzda pi sayısı otomatik olarak bu değere atanır ama aynı değer her obje oluşturduğumuzda bir kez daha initialize edilir buna gerek yoktur bu yüzden tek bir defa initialize edilmesi yeterlidir(you should never use constructor to set the static variable!!!***********)bu yüzden static variable initialize edilmesinde static blok kullanılır
        //constructor is only for instances not for statics

    }
    //constructor ve statik blok farkı
    //constructor her obje oluşturduğumuzda execute edilir statik blok ise sadece bir defa execute edilir bu yüzden static variable initialize edilmesi için statik blok kullanılır

    static{ // static does not have access to the instances
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
    //public static double pi = 3,14; peki yukarıda static variable bu şekilde kolaylıkla tanımlanabilirken static blokuna neden ihtiyaç var?
    //bu örnekteki gibi basit variable lar yani pi sayısı gibi olursa static blok kullanılmasa da olur ama mUhtarın dediğine göre gelecekte farklı variablelar olacak ve tek adımda tanımlanamayacak o zaman static blokuna ihtiyaç duyulacak

    //peki neden static variablelar initialize edilmesi için main metot kullanılmıyor?
    //çünkü main metot kullanarak initialize edersek main metot başka bir class da kullanılamayacağı için problem olur mesela test classında bu şekilde yazdırmak istersen null değerleri sonuç verir.yani main metot sadece oluşturulduğu classda execute edilebilir

//    public static void main(String[] args) {
//        pi = 3.14;
//        name = "Circle";
//        numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(20);
//    }


}
