package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {
        //copyOf() metodu array içerisindeki dizilimi kopyalamaya yarar
        //starts copying from the first element

        String[] students = {"Elif" , "Sinem" , "Gunay" , "Cihad" , "David" , "James" , "Aaron" , "Daniel"};

        //eğer ilk üç ismi başka bir arraya kopyalamak istersek

        String[] earlyBirds = Arrays.copyOf(students, 3);
        //students arrayinin ilk 3 elementi kopyalandı

        System.out.println(Arrays.toString(earlyBirds)); //[Elif, Sinem, Gunay]

        // String[] earlyBirds = Arrays.copyOf(students, 15); buraya 15 yazarsak mesela students arrayi içerisindeki bütün isimleri kopyalar kalan kısımları null olarak çıktı da gösterir(çok önemli değil bilgi amaçlı)

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers , 5); //{1,2,3,4,5}
        //herhangi bir arrayi sadece belli bir kısmıyla alıp tekrar aynı arraye atamak istersek bu şekilde yapılabilir

        //copyOfRange() metodu arrayin belirli bir kısmını kopyalamak istersek kullanılır copyOf her zaman 0.indeksten başlar bu ise istediğimiz yerden

        char[] ch1 = {'A' , 'B' , 'C' , 'D' , 'E' , 'F' , 'G' , 'H' , 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2,6);
                                                    //2.indeksten 6.indekse kadar(6 hariç)kopyalar substring gibi
        System.out.println(Arrays.toString(ch2)); //[C, D, E, F]

        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        int[] result = Arrays.copyOfRange(scores,3,7);
                                                                //excluded
        System.out.println(Arrays.toString(result)); //[40, 50, 60, 70]

        int[] result2 = Arrays.copyOfRange(scores,5,scores.length);
        System.out.println(Arrays.toString(result2));
        //herhangi bir indeksten sona kadar kopyalamak istersek

    }

}
