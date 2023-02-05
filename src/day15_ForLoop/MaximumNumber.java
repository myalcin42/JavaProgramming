package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {
        //write a program that asks the user to enter a number 5 times
        //return the maximum number

        Scanner scan = new Scanner(System.in);
        int max = -2147483648; //integer data tipinin en küçük numarası within the range
        //hangi numara girilirse girilsin bu numaradan büyük olacak

        for (int i = 0; i < 5; i++) { //buradaki 0 ve 5 rakamı loop işleminin kaç kere
            //yapılacağını gösterir başka bir amacı yoktur
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num > max){
                max = num;
            }


        }

            System.out.println("max = " + max);


    }


}
