package day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name & score:
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95); //put() metodu element ekler ama putAll() metodunun içerisine Map koyulur yani liste halinde ekleme yapmaz
        students.put("Maria", 95);
        students.put("Ali", 95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali", 85);
        students.put("Ali", 86);
        students.put("Ali", 87); //key değeri duplicate edilemeyeceği için bu son girdiğimiz element kabul edilir

        //display the score of Alex
        System.out.println(students.get("Alex")); //get() metodu key değeri belirtilerek bir elementin değeri alınmak istediğinde kullanılır çünkü key değeri unique dir

        //size()
        System.out.println(students.size()); //size() metodu element sayısını belirtir burada 7 dir

        //replace Ali' score to 90
        students.replace("Ali", 90);

        //remove() metodu
        students.remove("Alex"); //Mapte key değerini remove edersen value değeri de otomatik olarak remove edilmiş olur

        //containsKey() metodu
        boolean r1 = students.containsKey("Muhtar"); //false çünkü key değeri Muhtar olan bir element yok

        //containsValue() metodu
        boolean r3 = students.containsValue(100); // false çünkü key value değeri 100 olan bir element yok

        //isEmpty() metodu
        System.out.println(students.isEmpty()); //false çünkü Mapte element var

        System.out.println("===============     =================   ================");

        //equals() metodu
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students); //putAll metodu ile bir Mapi diğerine eklemiş olduk kullanımı bu şekilde

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println(map1 == map2); //hatırlanıldığı üzere bu şekilde kıyaslama yapılınca memory location yani hafızadaki yerine göre kıyaslama yapılır her ne kadar aynı değerleri içerse bile bu ikisi farklı objelerdir ve bu kıyaslamad AYNI değillerdir false yani

        System.out.println(map1.equals(map2)); //bu şekilde true olur çünkü aynı değerleri içerirler

        //clear() metodu
        //mapte bulunan bütün elementleri siler yani size() 0 olur




    }
}
