package day12_Scanner;

import java.util.Scanner;

public class Replit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = 4;
        int num2 = 6;
        int num3 = 2;
        int sum = 13;

        System.out.println("Enter three numbers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        System.out.println("Sum of numbers: " + (num1 + num2 + num3));



    }


}
