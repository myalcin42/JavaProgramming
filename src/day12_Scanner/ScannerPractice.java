package day12_Scanner;

import java.util.Scanner; //regular import:imports one class
//import java.util.*; //replitte bu gözüküyor buna wild import denir
//it is going to import everything from the util package
//Scanner is just a class from the util package
//ama programın maliyet etkin bir şekilde çalışması için ihtiyaç neyse
//onu çağırmak lazım
public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Scanner kısaca kullanıcıdan input alabilmek için kullanılır
        //ama başka işlevleri de vardır.Şimdilik input işlevinden bahsedilecek
        //Bu inputları almak için Scanner Methods kullanılır
        // Scanner scan = new Scanner(System.in); bu şekilde scan variable name atamasaydık
        //Scanner(System.in).nextInt();
        //Scanner(System.in).nextInt();
        //Scanner(System.in).nextInt();
        //Her bir input değeri için bu new object ifadesini belirmek zorunda kalacaktık

        System.out.println("Enter a number between 1 to 7");

        int num = scan.nextInt(); //Burada kullanıcıdan input istemek için Scanner Methods'lardan
                        //birisi olan nextInt() metodunu kullandık
        //Bu metodu çalıştırırsak konsolda kullanıcı değeri girmesi için bekler
        //Bu inputu girmesi için kullanıcıya scan.nextInt(); bu ifadeden önce bir print ifadesi
        //ile yapması gereken belirtilir  System.out.println("Enter a number between 1 to 7"); (gibi)

        String result = "";

        if(num >= 1 && num<= 7){

            result = (num == 1)? "Monday" :(num == 2)? "Tuesday" :(num == 3)? "Wednesday"
                    :(num == 4)? "Thursday" :(num == 5)? "Friday" :(num == 6)? "Saturday"
                    : "Sunday";

        }else{
            result = "Invalid Number";
        }

            System.out.println(result);

            scan.close(); //Scannerı kapatır
    }



}
