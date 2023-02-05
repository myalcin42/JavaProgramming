package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        //Eğer isim ve soyisimin ilk harflerini konsolda yazdırmak istersek
        //charAt() metodunu kullanırız

        char f = firstName.charAt(0); // ilk karakteri almak için metod içine sıfır yazdık
        char l = lastName.charAt(0);

        // String initial = f + l; bu şekilde yazarsak hata verir.Çünkü bu ifade String
        //olduğu için String data değeri atamak gerekir ama bu concatenation değildir.
        //Çünkü iki değerden birisinin String olması gerekir.Bunlar char tipindedir.
        //Bu yüzden;

        //String initial = "" + f + l; bu şekilde yazılabilir ama isim ve soyisim
        //arasında nokta işareti olması istendiği için

        String initial = f + "." + l;

        System.out.println("initial = " + initial);

        scan.close();


    }



}
