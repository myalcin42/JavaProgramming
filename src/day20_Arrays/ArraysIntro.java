package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that is capable enough to contain 5 names
        // String myGroup[] (tek bir tane [] brackets yazdığımız için single dimensional array olur.herhangi bir class import etmek zorunda değiliz Array için. [] javada brackets Array için ayrılmıştır.[] brackets gördüğünde orada Array var diyebilirsin
        //String myGroup[]; aşağıdakiyle aynı iki türlü declare edilebilir

        //String[] myGroup = new String[5]; //it can have 5 elements at the same time

        //System.out.println(myGroup); //bunu yazdırırsan konsolda [Ljava.lang.String;@6e8dacdf böyle bir ifade çıkıyor.Sebebi to String metodun execute edilmemiş olmasıdır.Bunu çözmek için aşağıdaki şekilde yazarız.Arrayda direk variable ismiyle yazdırma yapamazsın!!!!!!

        //System.out.println(Arrays.toString(myGroup)); //böyle yazdırmak gereklidir.Array declare etmek için class import etmeye gerek yok ama yazdırmak için bu ifadeyi girmek gereklidir. Bunu yazdırdığımızda konsolda [null, null, null, null, null] çıktısı belirir.Bu null keyword ifadesi bütün non-pirimitveler için default value idir. byte,short,int,long Primitive data tipleri için ise default value sıfır(0) dır.float, double için 0.0 dır.boolean için ise false'dur. char için ise '' dir.

        // int[] myGroup2 = new int[5];

        // System.out.println(Arrays.toString(myGroup2)); //[0, 0, 0, 0, 0] bu ifadeyi verir

        //Şu an String[] Array ifadesini sadece declare ettik ama içerisine herhangi bir değer atamadık.Array ifadelerde değer ataması indeks numarasına göre yapılır

        String[] myGroup = new String[5]; // 0 dan 4 e indeks numarası //we will use this initialization type;if we know how many elements and we dont know what these elements are
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael"; //myGroup[3] = "Mikael"; mesela 3.indeks numarasına bu şekilde hem Hulya hem de Mikael ismini atarsan çıktı da sadece Mikael ismi gözükür.Çünkü başlangıçta 3.indeks numarasına atanan Hulya, aynı indeks numarasına tekrar atanan Mikael ismiyle değişmiş olur.
        // myGroup[5] = "Muhtar"; bu array en fazla 5 öğrenci içerebilir bu yüzden bir öğrenci daha eklemek istersek index out of bound hatası alırız

        System.out.println(Arrays.toString(myGroup));
        //Mesela 0 indeks numarasına Gunay ismini atarsak konsolda [Gunay, null, null, null, null] ifadesi belirir.

        System.out.println("----------------------------------------------");

        //If you know the exact data that needs to be stored in the Array you also know how many data that will be stored then this is how you can declare Array;!!!!!***
            //index numbers 0           1           2               3           4
        String[] days = {"Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday" , "Sunday"};
        //  5             6
        //bu şekilde size of the Array otomatik olarak belirlenmiş olur yani bu örnekte 7 olur.

        // days[7] = "JavaDay"; eğer bu şekilde Array ifadesine bir veri daha eklemek istersek hata verir.Çünkü } ile Arrayın size'ı set edilmiş olacağı için yenisini bu şekilde ekleyemeyiz

        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number < 1 || number > 7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number - 1]); //Mesela burada number=5 sayısının karşılığı olan Friday ifadesinin array içerisinden çağırmak istersek bu print ifadesindeki gibi yazarız.Ama sadece 5 yazarsak indeks 0'dan başladığı için Saturday çıktıda belirir.O yüzden 1 çıkartıyoruz








    }

}
