package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {
        //toString() metodu converts the array object(single dimensional) to string, returns string (print the whole array)
        int[] nums = {1,2,3,4,5};

        System.out.println(nums); //Array objesi bu şekilde direkt olarak yazdırılamaz çıktı da hash kodu oluşturur

        System.out.println(Arrays.toString(nums)); // [1,2,3,4,5]

        /*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString()); //Normalde herhangi bir objeyi bu şekilde yazdırdığımızda toString metodu compiler tarafından otomatik olarak oluşturulur ama Array yazdırırken oluşturulmaz
        */

        System.out.println(nums[0]); //bu  şekilde array içerisindeki bir elementi yazdırmak istersek toString metodu kullanmaya gerek yoktur


        System.out.println("----------------------------------------");
        //sort() methodu küçükten büyüğe doğru sıralama yapar sorts the array in ascending order
         int[] scores = {95,100,55,65,85,70};

         Arrays.sort(scores); // {55 ... 10} sort metodu direkt olarak print içerisinde kullanılamaz önce bu şekilde kullanmak gerekir

        System.out.println(Arrays.toString(scores)); // [55, 65, 70, 85, 95, 100]

        //bu şekilde minimum ve maksimum sayıyı bulmak kolaylaşır

        System.out.println("Min Score: " + scores[0]);
        System.out.println("Max Score: " + scores[scores.length - 1]);

        String[] names = {"Gunay" , "Anna" , "Zuhal" ,  "Ahmet" , "Maria" , "Sinem"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
        //[Ahmet, Anna, Gunay, Maria, Sinem, Zuhal] sort() metodu karakter sıralaması da yapar

        String[] words = {"Anna" , "ANNA"};

        Arrays.sort(words);

        System.out.println(Arrays.toString(words)); // [ANNA, Anna] küçük harf Ascii tablosunda büyük harften sonra geldiği için bu şekilde sıralar

        System.out.println("-----------------------------------------");

        //equals(array1, array2) metodu iki arrayın eşit olup olmadığına bakar
        //checks if two arrays are equal
        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2); // returns boolean. iki arrayın de indeks numaralarını karşılaştırıp eşit olup olmadığına bakar bu örnekte aynı iki Arrayde de aynı numaralar olmasına rağmen farklı indekste bulundukları için benzer değildir

        System.out.println(r1); //false olur

        //Eğer indeks numaralarındaki dizilimi önemsemeden bu karşılaştırmayı yapmak istersek önce iki arrayi de önce sort edip sonra kıyaslarız

        Arrays.sort(arr1); //{1,2,3}
        Arrays.sort(arr2);// {1,2,3}

        boolean r2 = Arrays.equals(arr1, arr2);

        System.out.println(r2); // bu şekilde true olur

        System.out.println("------------------------------------------------");
        //anagram sorusu
        char[] ch1 = {'a' , 'c' , 'b'};
        char[] ch2 = {'b', 'a' , 'c'};

        Arrays.sort(ch1);//{a,b,c}
        Arrays.sort(ch2);//{a,b,c}

        boolean anagram = Arrays.equals(ch1, ch2);

        System.out.println("anagram= " + anagram); // true



    }


}
