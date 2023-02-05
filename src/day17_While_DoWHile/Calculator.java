package day17_While_DoWHile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();

        System.out.println("Enter your second number");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator");
        char ch = scan.next().charAt(0);

        /*if( ! (ch == '+' || ch == '-')){
            System.out.println("Invalid operator, please re-enter");
            ch = scan.next().charAt(0);
        }*/
            //Burada +(toplama) ya da -(çıkarma) işlemi operatörlerini kullanıcı girmediği zaman if ifadesiyle tekrar girmesini isteyebiliriz ama bu sadece tek sefer gerçekleşir.İşte kullanıcının kaç defa yanlış operatör gireceğini bilmediğimiz için while loop burada uygun bir çözümdür

        while ( ! (ch == '+' || ch == '-')){
            System.out.println("Invalid operator, please re-enter");
            ch = scan.next().charAt(0);
        }
        //while() parantez içerisindeki ifade false olana kadar döngüye devam eder

        System.out.println((ch == '+')? num1 + num2 : num1 - num2);

    }



}
