package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers, 0, numbers.size() - 1);

        System.out.println(numbers); // [8, 2, 3, 4, 5, 6, 7, 1]

        System.out.println("==========================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));//sıfırları sona atıcaz

        int size = list.size();
        list.removeAll(Arrays.asList(0));

        System.out.println(list); // [1, 2, 3, 4]

        int newSize = list.size();

        int totalNumberOfZeros = size - newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros); // 4

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }

        System.out.println(list); // [1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("===================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if(each != 0){
                result.add(each);
            }
        }

        System.out.println(result); // [1, 2, 3, 4]

        for (Integer each : list2) {
            if(each == 0){
                result.add(each);
            }
        }

        System.out.println(result); // [1, 2, 3, 4, 0, 0, 0, 0]

        System.out.println("======================================");

        String str = "ABCD123$%#@&456EFG!";

        ArrayList <Character> chars = new ArrayList<>(); // Character classında bir Arraylist oluşturduğumuz için String variable split metodu kullanarak Arraye çevirsek bile Character olduğu için kabul etmez.toCharArray metodunu kullanıp Arraye çevirsek primitive data tipi olduğu için Arraylist kabul etmez .Tek yöntem for loop kullanarak her karakteri Arrayliste aktarmaktır

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i)); //her karakteri Arrayliste ekleriz
        }

        ArrayList<Character> letters = new ArrayList<>(chars); // chars Arraylistindeki bütün listeyi letters Arraylistine ekleriz ki harf olmayan bütün karakterleri buradan çıkarabilelim

        System.out.println("letters = " + letters); // letters = [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

        letters.removeIf(p -> ! (Character.isLetter(p)));
        System.out.println("letters = " + letters); // letters = [A, B, C, D, E, F, G]

        ArrayList <Character> digits = new ArrayList<>(chars);
        digits.removeIf(p -> !(Character.isDigit(p)));
        System.out.println("digits = " + digits); // digits = [1, 2, 3, 4, 5, 6]

        ArrayList<Character> specialChars = new ArrayList<>(chars);
        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        // specialChars.removeIf( p -> Character.isLetterOrDigit(p));

        System.out.println("specialChars = " + specialChars); // specialChars = [$, %, #, @, &, !]
    }


}
/*
1.write a program that can swap the first and last elements of an ArrayList

2.write a program that can move all the zeros to the last indexes of Arraylist

3.write a program that can extract special characters, digits and letters from a string and stores them into separate Arrays

            ex : str = "ABCD123$%#@&456EFG!"

            output :
            list 1 = {1,2,3,4,5,6}
            list 2 = {A,B ,C,D,E,F,G}
            list 3 = {$, %, #, @, &, !}
 */