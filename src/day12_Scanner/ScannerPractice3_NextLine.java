package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //nextline metodu next den farklı olarak
        //aynı satırda kullanıcı enter a basana kadar herşeyi okur
        //ve sadece nextline metodu enter tuşunu okuyabilir.Diğer bütün metodlar için
        //kullanılan enter Scanner hafizasında kalır diğer metodlar bunu okuyamaz

        System.out.println("Enter your Programming Language");
        String programming = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();//nextInt metodu enter tuşunu okuyamadığı için
        //yaş kullanıcı tarafından konsolda girildikten sonra basılan enter tuşu, Scanner
        //hafızasına gider.Bundan sonra aşağıda schoolName datasına veri girilmesine izin
        //vermez.O yüzden enter tuşunu okuyamayan diğer bütün metodlardan sonra Scanner
        //hafızasını boşaltmak gerekir.O yüzden schoolname datasından önce o enter tuşunu
        //nextline metoduna alabilmek için bir kez daha nextline kullanılması gerekmektedir

        input.nextLine(); //Yani bu şekilde enter tuşunu Scanner hafızasından buraya çeker
        //ve hafızayı boşaltırız ki sonrasında istenen veri konsolda girilebilsin
        //capture the Enter key that user pressed for nextInt()

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }



}
