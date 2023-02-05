package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        System.out.println("Enter a word:");
        //Eğer kullanıcıdan tek bir sefer için girdi alacaksak Scanner variable gerek yok
        //Aşağıdaki şekilde bir String objesi oluşturulabilir

        String word = new Scanner(System.in).next();//Sadece kullanıcıdan tek bir input
        //almak için

        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x" , "a");
        }

        System.out.println(word);

    }


}
/*
1. Write a program that asks user to enter a word.
If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */