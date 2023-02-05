package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        //Bulk Operations collectionlar için kullanılır yani argument must be a collection type
       //addAll() metodu : adds collection of values to the ArrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); // asList() metodu Arrays utility classından bir metot.Array of values'ü collection type çevirir

        System.out.println(list); // [1, 2, 3, 4, 5, 6, 7,8,9,10]

        //removeAll(CollectionType) metodu : removes all the matching elements from the ArrayList
        list.removeAll(Arrays.asList(3,5,8)); // eşleşen bütün elementleri kaldırır sadece bir tanesini değil mesela kaç tane 3 varsa hepsini kaldırır

        System.out.println(list); // [1, 2, 4, 6, 7, 9, 10]

        System.out.println("======================================");

        // retainAll(CollectionType) metodu : removes all the non-matching elements from the ArrayList (removeAll) metodunun ters işlevini yapar.retain kelimesinin anlamı tutmak demektir zaten yani yazdığın elementleri tutar diğerlerini remove yapar

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));

        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);  // [100, 200, 300, 100, 200, 300]

        System.out.println("======================================");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET")); // [QA, SDET, QA, SDET]

        System.out.println(jobTitles);

        System.out.println("============================================");

        //containsAll(CollectionType) metodu: check if all the elements are contained in the ArrayList

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10);
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        System.out.println("r1 = " + r1); // true
        System.out.println("r2 = " + r2); // true

        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));

        System.out.println("r3 = " + r3); // true ((2,5,10) bu 3 element de nums ArrayList içerisinde olduğu için true olur ama sadece bir tanesi olmazsa false olur

        System.out.println("======================================");
        //non primitive br Array varsa bu array arrayliste dönüştürülebilir
        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};
            //Birinci yol
//        ArrayList<String> namesList = new ArrayList<>();
//        namesList.addAll(Arrays.asList(names));
        //İkinci yol
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        System.out.println(namesList); // [Josh, Jack, Daniel, Shay, Breanna]

        System.out.println("=======================================");

        //peki primitive bir Array olursa Arrayliste nasıl dönüştürürüz??
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>(); // asList kullanamayız çünkü Array primitive içermektedir.Bu dönüşümü yapmak için bir custom metot oluşturabiliriz

        System.out.println("=========================================");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3 = " + list3); // list3 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }

}
