package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6));
        list1 = list1.stream().distinct().collect(Collectors.toList()); //excludes the duplicates

        System.out.println(list1); // [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6] ama orijinal listeyi değiştiremez ama yukarıdali gibi metot kullanıp tekrar data structure assign edersek sonucu elde ederiz

        int[] arr1 = {1,1,2,2,3,3,4,4,5,5,6,6};
        arr1 = Arrays.stream(arr1).distinct().toArray();

        System.out.println(Arrays.toString(arr1));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());

        System.out.println(list2); //[6, 7, 8, 9, 10] ilk 5 elementi skip() etti

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        nums2 = Arrays.stream(nums2).skip(4).toArray();

        System.out.println(Arrays.toString(nums2)); // [5, 6, 7, 8, 9, 10] ilk 4 elementi skip() etti

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3 = list3.stream().limit(7).collect(Collectors.toList());

        System.out.println(list3);  //[1, 2, 3, 4, 5, 6, 7] limit() metodu element sayısını kısıtlar ve belirtilen sayı dışındaki bütün elementler remove edilir

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4 = list4.stream().limit(7).skip(3).collect(Collectors.toList());

        System.out.println(list4); //[4, 5, 6, 7] limit metodu ve skip metodu birlikte kullanılabilir

        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list5 = list5.stream().map( p -> p * 10 ).collect(Collectors.toList());

        System.out.println(list5);  // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] map() metodu elementler üzerinde modifiye etme imkanı verir ve içerisine function functional interface lambda ifadesi kabul eder

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        days = days.stream().map( p -> p.substring(0,3)).collect(Collectors.toList());

        System.out.println(days); // [Mon, Tue, Wed, Thu, Fri, Sat, Sun]

        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens = list6.stream().filter( p -> p % 2 == 0).collect(Collectors.toList());

        System.out.println(evens);  // [2, 4, 6, 8, 10]

        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        long countJava = names.stream().filter( p -> p.equalsIgnoreCase("java")).count();

        System.out.println(countJava); // 3 count() metodu spesifik element sayısını tespit eder

        names.stream().filter( p -> p.equalsIgnoreCase("java")).forEach( p -> System.out.println(p));

        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        boolean r1 = list7.stream().allMatch(p -> p % 2 == 0); // false allMatch() metodu predicate olarak girilen lambda ifadesindeki elementlerin eşleşip eşleşmediğini kontrol eder list7 de bulunan bütün elementler çift sayı olmadığı için false döndürür

        boolean r2 = list7.stream().anyMatch( p -> p > 20); // liste 7 de 20 den büyük bir element olmadığı için false döndürür ama en az bir element bile koşulu sağlasaydı true olurdu

        boolean r3 = list7.stream().noneMatch(p -> p % 3 == 0);

        System.out.println(r3); // false döner ama bütün elementler 3 ile bölünebilir olmasaydı true döndürürdü

        


    }



}
