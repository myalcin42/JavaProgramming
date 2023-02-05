package day42_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword { //throw keyword ile throws keyword benzemesine rağmen throws keyword checked eceptions için geçici handling işlemi yapar ama throw keyword manuel olarak excepiton oluşturmamıza imkan verir

    public static void main(String[] args) {

        System.out.println("Enter your age");
        int age = new Scanner(System.in).nextInt();

        if(age < 0){ // eğer kullanıcı 0'dan küçük bir sayı girerse şimdiye kadar invalid deyip programı exit() ile sonlandırmıştık.Ama bu tür durumlar için bir exception throw edilebilir
//            System.err.println("Invalid age");
//            System.exit(1);
            throw new InputMismatchException("Age can not be negative: " + age); //burada System.exit ile programı sonlandırmak yerine kendimiz bir throw exception oluşturup programı sonlandırabiliriz(eğer koşul gerçekleşirse)exception ismi unchecked exceptionslardan bir tanesi olabilir

        }

        if(age > 21){
            System.out.println("You are eligible to vote");
        }else{
            throw new RuntimeException("You must be at least 21 years old");
        }
    }
}
