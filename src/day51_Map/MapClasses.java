package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //      Map iki ayrı data tipini aynı anda barındırabilir colectiondan farkı budur key değeri unique olmak zorunda kopyası kabul edilmez ama value aynı olabilir
       //      key     value
        Map<Integer, String> hashMap = new HashMap<>(); //maintains random order.the fastest Map type based on performance. most common one in usage.accepts null value
        hashMap.put(10, "Arthur"); //Mapte reference tipi olarak ne belirtirsen onu girmek zorundasın
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");
        hashMap.put(5, "Ahmet"); //burada key değeri olan 5 duplicate kabul edilmeyeceği için son girilen değer öncekini siler yani Isabella yı
        hashMap.put(6, "Ahmet");
        hashMap.put(7, "Ahmet");
        hashMap.put(8, "Ahmet"); //ama value değerleri için kopya kabul edilir
        hashMap.put(null, "Cihad");
        hashMap.put(null, "Hulya"); //null key değeri olduğu için tek bir kopya kabul eder
        

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");
        // linkedHashMap girilen element sırasını muhafaza eder

        Map<Integer, String> treeMap = new TreeMap<>(); //maintains the sorted order.does not accept null as a key
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5, "Isabella");
        treeMap.put(7, null);
   //     treeMap.put(null, "Hulya"); //null eklemek istersek NullPointerException hatası alırız çünkü null kabul etmez ama sadece key null olmaz ama value olabilir

        Map<Integer, String> hashtable = new Hashtable<>();//maintains the random order, null kabul etmez, synchronized(thread safe)
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
     //   hashtable.put(6, null); hashTable da value da null olamaz exception verir


    }
}
