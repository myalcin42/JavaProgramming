package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        //for (char i = 'A', j = 0 ; i <= 'Z' && j < letters.length; i++ , j++){
        //letters[j] =i; // i: index number starting from 0 - last index
        //}

        //ya da
        //for (int i = 0 , j = 'A'; i < letters.length ; i++ , j++{
        //letters[i] = (char)j;
        // ya da loop içerisinde 2 farklı değişken kullanmak istemezsek

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("---------------------------------------------");





    }


}
