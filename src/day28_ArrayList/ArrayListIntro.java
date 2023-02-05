package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {
        //ArrayList bir collection data structure çeşididir
        //ArrayList Arraye göre üstünlüğü birçok kullanışlı metota sahip olmasıdır
        ArrayList<Integer> numbers = new ArrayList<>();
        //ArrayList<Integer> numbers = new ArrayList<Integer>(); bu şekilde de yazılabilir önemli olan iki data tipinin de aynı olmasıdır.İkinci data tipini yazmak opsiyoneldir.

        ArrayList<String> names = new ArrayList<>();

        System.out.println(numbers); //ArrayList otomatik olarak toString metoduna sahiptir.Bu yüzden Arraylist yazdırmak istediğimizde toString() metodunu çağırmak zorunda değiliz
        System.out.println(names);





    }

}
