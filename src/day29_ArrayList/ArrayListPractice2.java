package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        //Ahmet ve David dışında bütün isimleri kaldır
        employees.addAll(Arrays.asList("Ali","David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll(Arrays.asList("Ahmed", "David")); // retainAll removes the unmatching elements

        System.out.println(employees); // [David, Ahmed, Ahmed, David]

        System.out.println("==========================================");
        //ismi M harfi ile başlayanları Arrayden kaldır
        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf( p -> p.startsWith("M")); // ya da p.charAt(0) == 'M'

        System.out.println(list);  // [Sumeyra, Hasan, Beril]

        names = list.toArray(new String[0]); // toArray Arraylisti Arraye çevirir

        System.out.println(Arrays.toString(names)); // [Sumeyra, Hasan, Beril]
    }

}
