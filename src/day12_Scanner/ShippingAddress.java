package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = scan.next(); //nextline metodundan önce
        //nextline dışında bir metot kullanmışsan, Scanner a kaydedilen enter tuşunu
        // almak ve Scanner hafızasını boşaltmak için
        // ekstra bir nextline metot ifadesi kullanırsın

        scan.nextLine(); //Eğer nextline öncesi başka bir metot varsa bunu yazmalısın
        //Bunu yazman gereken tek koşul bu, nextline öncesi nextline dışında
        // başka bir metot kullanımı
        System.out.println("Enter your Street Name");
        String streetName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String stateName = scan.next();

        System.out.println("Enter your zip code");
        String zipCode = scan.next(); //mesela iki tane next metodu arka arkaya
        //kullanılmış ama arasına nextline kullanılmıyor
        //Fakat bu iki ifade enter tuşunu ignore ettikleri için şu anda iki tane fazla
        //enter tuşu Scanner hafızasında duruyor.Ama iki tane enter tuşu hafızada olsa
        //bile bir tane fazladan nextline metodu eklemek yeterli olur

        scan.nextLine();

        System.out.println("Enter your country name");
        String country = scan.nextLine();

        scan.close();

    }


}
/*
1.Enter your full name
2.Enter your building number
3.Enter your Street name
4.Enter your city name
5.Enter your state
6.Enter your zip code
 */