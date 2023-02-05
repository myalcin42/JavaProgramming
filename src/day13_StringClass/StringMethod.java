package day13_StringClass;

public class StringMethod {

    public static void main(String[] args) {

        String word = "Cydeo";
            //index:   01234
        char thirdChar = word.charAt(3);

        System.out.println("thirdChar = " + thirdChar); // 3. karakteri çağırdık 'e'

        char tenthChar = word.charAt(2);

        //System.out.println("tenthChar = " + tenthChar);//index numarası out of range hata
        //verir.Cydeo kelimesindeki maksimum indeks numarası 4'tür.

        //Sıradaki metot length() metodudur.Bu metot "returns the total number of
        //characters. returns integer number bu yüzden int olarak atanır

        System.out.println("-----------------------------------------");

        String s1 = "Batch 25 is the best batch"; //Eğer bu cümlede kaç karakter olduğunu
        //bulmak istersek length() metodu kullanırız

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars); // 26 karakter olarak çıktı verir
        //Mesela kaç karakter olduğunu bildiğimiz için sondaki karakteri çağırmak istersek

        char lastChar = s1.charAt(s1.length() - 1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("---------------------------------");

        //Sıradaki metot toLowerCase() ve toUpperCase()

        String str = "wooden spoon"; // this "wooden spoon" object, once it is created
        //it is immutable(yani değiştirilemez can not be modified)
        //str.toUpperCase();
        // oluşturulan her String objesi değiştirilemez olduğu için
        //bu metot yeni bir obje oluşturur (WOODEN SPOON olarak)(eskisini değiştiremez
        // aslında hiçbir String metodu
        //hiçbir String objesini modifiye edemez çünkü String objesi immutable'dır

        //System.out.println(str); //burada str.toUpperCase(); dememize rağmen konsolda
        //halen "wooden spoon" (küçük harfle) olarak gözükecek.Çünkü str variable name
        //sadece tek bir data içerebilir.O yüzden en son 38. satırda str yi wooden spoon olarak
        //atamıştık.O yüzden büyük harflerle görmek istiyorsak aşağıdaki gibi tekrar atama
        //yapmak gerekir

        str = str.toUpperCase();

        System.out.println(str);
        //Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println(sentence); //loLowerCase() metodu da bunun aynısı sadece tersi








    }



}
