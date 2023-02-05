package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        //create an element that contain in 26 characters

        char[] alphabet = new char[26]; // Z - A ya
        /*       i     ch
        alphabet[0] = 'Z'; //90 from Ascii table
        alphabet[1] = 'Y'; //89
        alphabet[2] = 'X'; //88
        */


        //System.out.println(Arrays.toString(alphabet));//Arrayın tamamını yazdırmak istiyorsan toString metodunu kullanmak zorundasın ama Array içerisinden bir elementi yazdırmak istersen toString metodu kullanılmasına gerek yoktur

        //System.out.println(alphabet[0]);//mesela bu Arrayın tamamı değildir sadece indeksi yazdırmak için bu kullanılır

        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++ , ch--) {
            alphabet[i] = ch;
        }

        // ya da aşağıdaki şekilde yapılır

        for (char i = 0,j= 'Z'; i < alphabet.length ; i++ , j--){
            alphabet[i] = j;
        }



        System.out.println(Arrays.toString(alphabet));






    }


}
