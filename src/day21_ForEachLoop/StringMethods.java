package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        //toCharArray() metodu
        //if you want to create a char array from a string you may use this method
        String str = "Java";
        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars)); //[J, a, v, a]

        for(char each : chars){
            System.out.println(each);
        }

        System.out.println("---------------------------------------------");
        // split() metodu (if you want to create a string array from a string you may use this method.
        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words)); //[Wooden, Spoon]

        System.out.println("--------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@"); // @ işaretini baz alarak Stringi böler ve belirttiğin bölünme noktasını yeni dizilimde göstermez

        System.out.println(Arrays.toString(arr)); //[WoodenSpoon, cydeo.com]

        System.out.println("--------------------------------------------");

        String s = "Today is nice day.Today is Monday.Today we learn Java";

        String[] sentences = s.split("\\. "); // "." will not be included
        //noktadan itibaren bölmek istersen \\ bunu kullanmak zorundasın bu bir escape sequences değil sadece nokta için oluşmuş bişey

        System.out.println(Arrays.toString(sentences)); //[Today is nice day.Today is Monday.Today we learn Java] muhtarın dersinde arada virgül vardı ama bende nokta çıktı anlamadım



    }


}
