package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647; //any number that user enters will be less than this number
        //because it is the maksimum number that an integer data type can get

        for (int i = 10; i < 15; i++) { //for loopta başlama noktası önemli değil
            //10 da olabilir başka bir rakam da.Önemli olan kaç defa loop kendini tekrar
            //layacak onu belirlemek .Tekrarlanacak ifadeler loop içerisine yerleştirilir
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if(num < min){
                min = num;
            }

        }

            System.out.println(min);
            scan.close();
    }


}
