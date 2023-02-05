package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        //Arrayde remove fonksiyonu olmadığı için Arrayliste çeviririz
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        //p represents the each element of the ArrayList
        list.removeIf(p -> p.length() >= 10);

        //converting ArrayList back to Array
        countries = list.toArray(new String[0]); //String[0] burada sıfır verilmesinin sebebi daha sonra bu rakamın Arraylist size ile değişeceğindendir

        System.out.println(Arrays.toString(countries)); // [Japan, Korea, Turkey, Canada]

    }

}
/*
1.create an Array of string called countries

2.write a program that can remove all the country names that have length of 10 or greater
 */