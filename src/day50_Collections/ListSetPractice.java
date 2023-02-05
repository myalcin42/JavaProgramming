package day50_Collections;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));

        System.out.println(set.size()); // 10 element eklememize rağmen duplicate kabul etmediği için size 5 olur

        //    Integer[] array = set.toArray(new Integer[0]); Seti Arraye çevirdiğimizde Arrayin size fixed olduğu için elementler üzerinde ekleme kaldırma yapamayız ve Array fazla metodu yoktur o yüzden Liste çevirmek daha mantıklı

        List<Integer> list = new ArrayList<>(set);

        System.out.println(list); // [1, 2, 3, 4, 5]

     //   List<String> names = null;

        //  System.out.println(names.size()); NullPointerException

        System.out.println("=============== ================ =============");

        //pop() ==> LIFO
        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));

        ((Stack) chars).pop();

        System.out.println("chars= " + chars); // [A,B,C] son giren ilk çıktı

        //poll() ==> FIFO

        List<String> names = new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        ((LinkedList)names).poll();

        System.out.println(names); // [Jimmy, Kathy, Breanna, Max] ilk giren ilk çıktı
    }
}
