package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        //store those elements to the Array: 10 ,20,50,70

        int[] numbers = {10,20,50,70}; //size of the Array is 4

        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------");

        //create a variable that can contain 5 scores

        int[] scores = new int[5];
        scores[1] = 85;
        scores[scores.length - 1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores)); // [65, 85, 55, 75, 95]

        System.out.println("-------------------------------------------");

        String[] months = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
        //indeks number aralığı 0 - 11(length - 1)
        /*
        System.out.println(months[0]); //January
        System.out.println(months[1]); //February
        System.out.println(months[2]); //March
        System.out.println(months[3]); //April
        System.out.println(months[4]); //May
        System.out.println(months[5]); //Jun
        System.out.println(months[6]); //July
        System.out.println(months[7]); //August
        System.out.println(months[8]); //September
        System.out.println(months[9]); //October
        System.out.println(months[10]); //November
        System.out.println(months[11]); //December
        */

        for (int i = 0 ; i < months.length ; i++){ // i: represents the index numbers of Array starting from 0
            System.out.println(months[i]);
        }

        System.out.println("--------------------------------------");

        for(int i = months.length -1; i >= 0 ; i--){ // i : represents the index numbers of Array starting from last index
            System.out.println(months[i]);

        }








    }



}
