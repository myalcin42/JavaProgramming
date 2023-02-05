package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {
        //Alttaki 3 arrayi tek bir arrayde depolamak istersek N= array sayısı N-1 de genel formül yani 3 array için 2 boyutlu bir yeni array oluşturmak gerekmektedir
        String[][] groups = new String[3][]; //Buradaki 3 rakamı arrayin içerisinde kaç tane tek boyutlu array olacağını gösterir ve bu çok boyutlu indekste indeks numaraları 0,1,2 dir. burada kaç array olacağını biliyoruz ama arrayların ne olduğunu bilmiyoruz

        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Jon", "Joes", "James"};
        String[] group3 = {"Jon", "Joes", "James"};

        groups[0] = group1; //aynı tek boyutlu array de element atadığımız gibi burada da her indekse bir array atıyoruz
        groups[1] = group2;
        groups[2] = group3;

        //System.out.println(Arrays.toString(groups)); //toString metodu sadece tek boyutlu array için kullanılır bu print ifadesi hash kodu gösterir

        System.out.println(Arrays.deepToString(groups)); //çok boyutlu array yazdırmak için deepToString metodu kullanılır

        System.out.println("----------------------------------------------");

        //Eğer multi dimensional array içerisinde hangi arraylarin olacağını kesin olarak biliyorsak aşağıdaki şekilde initialize yapılır
//index of the elements:     0 1 2    0 1 2 3     0 1 2  3   4
        int[][] array2D = { {1,2,3}, {4,5,6,7} , {8,9,10,11,12} };
                    //index:  0           1             2

        //int[][] buradaki iki köşeli parantez farklı iki indeks numarasını temsil eder ilk parantez array indeksini ikincisi ise element indeksini ifade eder

        System.out.println(Arrays.deepToString(array2D));
        //[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]

        System.out.println(Arrays.toString(array2D[1])); //[4, 5, 6, 7]

        System.out.println(array2D[2][3]); //iki boyutlu arrayden sadece bir elementi çağırmak istersen bu şekilde yazılır 11 olur













    }

}
/*
String[] group1 = {"Jon", "Joes", "James"}
String[] group1 = {"Jon", "Joes", "James"}
String[] group1 = {"Jon", "Joes", "James"}
 */
