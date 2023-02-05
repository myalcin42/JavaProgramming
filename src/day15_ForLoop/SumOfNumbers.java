package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        double sum = 0;

        for (int i = 1; i < 101 ; i++) {    //fori yazarsan kısayolu
            sum += i;
        }

        System.out.println(sum);

        System.out.println("----------------------------------------");

        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            total += scan.nextInt();
            //bu ifadeyi loop içerisine yerleştirirsek istediğimiz kadar kullanıcıdan
            //rakam girmesini isteyebiliriz sadece tek bir ifadeyle
        }

        System.out.println("total = " + total);

        scan.close();
    }


}
