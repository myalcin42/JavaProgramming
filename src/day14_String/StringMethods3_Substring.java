package day14_String;

public class StringMethods3_Substring {

    public static void main(String[] args) {
        //substring(beginning index, ending index) metot

        String word = "Cydeo School";
        //             012345....

        String brand = word.substring(0,4);

        System.out.println(brand); //Cyde olarak çıktı verir.Son indeks hariç tutulur
        //o yüzden String brand = word.substring(0,4+1); olarak yapılır

        String str1 = word.substring(6); //string ifadesinin sonuna kadar ise
        //ending index i belirtmeye gerek yok
        System.out.println(str1); //School olur

        System.out.println("----------------------------------------");

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0,word2.indexOf(" ")); //ilk kelimeyi buna ata Java
        //burada ending index olarak Java kelimesinden sonraki boşluk karakteri kullanmamızın
        //sebebi substring metodunun son karakteri hariç tutma prensibidir yani boşluk hariç
        //O ve aradaki karakterler gösterilsin (Java)
        String s2 = word2.substring ( word2.indexOf(" ") +1 , word2.lastIndexOf(" ")    );
        //Programming kelimesini s2 değişkenine atamak için bu ifade yazılabilir
        //Burada genel olarak herhangi bir String diziliminin 2.kelimesi ilk boşluk
        //karakterinden sonra başlar.Burada word2.indexOf(" ") +1  ifadesi bunu temsil eder
        //diğer ifade de son kelimeden önceki boşluğa karşılık gelir bu aradaki karakter
        //dizilimi 2.kelimeyi sonuç verir
        String s3 = word2.substring( word2.lastIndexOf(" ") +1 );
        //Burada da 3.kelime bu cümlede son kelime olduğu için son boşluktan sonra başlar
        //word2.lastIndexOf(" ") +1 bu ifade bunu temsil eder.Son kelime olduğu için de
        //ending indexe gerek yoktur
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }


}
