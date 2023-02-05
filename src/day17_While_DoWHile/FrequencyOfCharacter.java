package day17_While_DoWHile;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
            String str = "AAABBBC";
            char ch = 'A';

            int frequency = 0;

            for (int i = 0; i < str.length() ; i++) { // i: index numbers of str
                char eachChar = str.charAt(i); //eachchar represents each character of str
                if(ch == eachChar){ //if given char is matching with the eachChar, then ch is appeared in the string
                    frequency++; // ya da frequency += 1;

                }
            }

                    System.out.println(frequency);


    }




}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */