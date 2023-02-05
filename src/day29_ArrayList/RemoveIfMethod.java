package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        //remove all the odd numbers from list
//        for (int i = 0; i < list.size(); i++) {
//
////            if(list.get(i) % 2 != 0){
////                list.remove(i); // collection flexible bir data structure olduğu için her remove işleminde indeks numaraları değişir ve bu işlem doğru sonucu vermez
//            }

            //bu list de 5 den küçük elementleri kaldırmak istersek
            list.removeIf(p -> p < 5 ); // Lambda Expression

        System.out.println(list); // [5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]

        System.out.println("====================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //remove all the even numbers
        //Burada bir koşullu remove olayı olduğu için elementleri bilmiyoruz o yüzden remove ya da removeAll kullanamayız.removeIf metodu kullanılır

        list2.removeIf(each -> each % 2 == 0); // lambda expression

        System.out.println(list2); // [1, 3, 5, 7, 9]

        System.out.println("======================================");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

        //remove elements starts with J

        list3.removeIf( p -> p.startsWith("J")); // p: variable name

        System.out.println(list3); // [Python, C#, C++]

        System.out.println("=============================================");

        //remove all the palindromes from the ArrayList

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "level", "eye", "Java", "Python", "Cydeo"));

        names.removeIf( name -> StringUtility.isPalindrome(name)); //kendi oluşturduğumuz metodu kullandık

        System.out.println(names); // [Java, Python, Cydeo]

        //palindrome olmayanları remove etmek istersek
        // names.removeIf( name -> ! StringUtility.isPalindrome(name)); ünlem işareti koymamız yeterlidir
        //removeIf metodu bütün collection data yapıları için kullanılır



        }


    }


