package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        Set<String> set1 = new HashSet<>(Arrays.asList(arr));

        System.out.println(set1); //[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk] removews the duplicated and random order of the elemnents

        arr = set1.toArray(new String[0]);

        System.out.println(Arrays.toString(arr)); //[Paper towels, Wooden Spoon, Coke, Eggs, Book, Phone, Pen, Milk]

        //arr = new HashSet<>(Arrays.asList(arr)).toArray(new String[0]); yukarıdaki ifadelerin kısa bir şekilde ifade edilmesi

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(new LinkedHashSet<>(list));

        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums)); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        System.out.println("=============      ======================       ==========");

        String str = "eeeeeaaaabbbbccccdddeeeee";

        //  eabcd
        //  54434


        String result = ""; //e5a4b4c4d3

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count = Collections.frequency(Arrays.asList(str.split("")), each);
            result += each + count;
        }

        System.out.println(result);  // e10a4b4c4d3

        System.out.println("========       ==============          =============");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println(names.toArray(new String[0])[2]);

        System.out.println(new ArrayList<>(names).get(4)); //Set indeks numarasına sahip olmadığı için for each loop ile elemnetlerine ulaşılabilir ama bu şekilde List'e çevirirsek istedfiğimiz indeks numarasınsda bulunan elemente ulaşbiliriz



        
    }
}
