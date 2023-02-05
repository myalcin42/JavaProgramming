package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "     batch   25     ";
        str1 = str1.trim(); // "batch 25"==> trim() metodu "     batch   25     " içerisinde
        //bulunan whitespace denilen kelimenin solundaki ve sağındaki boşlukları giderir
        //only the spaces that are not separating the characters will be removed by
        //trim() method. iki kelime arasındaki boşluğu kaldırmaz "Ali    Veli" gibi.
        //Yani spaces before and after the text will be removed(white spaces)
        System.out.println(str1);

        System.out.println("------------------------------------------");

        String str2 = "Cydeo School"; //Eğer buradaki 'h' harfinin ya da
        //başka bir tanesinin indeks numarasını
        //bulmak istersem indexOf() metodu kullanılır

        int n1 = str2.indexOf("h"); // 'h' olarak da yazılabilir
        System.out.println("n1 = " + n1);

        //int n2 = str2.indexOf("o"); //Mesela bu metotu kullanarak "Cydeo School" ifadesindeki
        //3. "o" harfinin indeks numarasını bulmak istersek; str2.indexOf("o"); bu
        //şekilde yazdığımızda soldan sağa doğru kontrol edeceği için metot karşılaştığı
        //ilk "o" harfinin numarasını gösterir.

        int n2 = str2.indexOf("ool"); //bu şekilde belirttiğimizde "" ifadesinin içerisinde
        //bulunan dizilimin ilk harfinin indeks numarasını gösterir
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming language"; //progr'a' içerisindeki a nın indeks nosu
        //int n3 = str3.indexOf("a");//bu şekilde yazarsak soldan itibaren gördüğü
        //ilk a harfinin yani bu örnekte "Ja" indeks numarasını verir(1).
        //int n3 = str3.indexOf("a "); //Bu şekilde a'dan sonra boşluk bırakarak yazarsak
        //ilk a ve sonrasında boşluk olan kısmı kontrol eder "Java " yani bo örnekte java
        //kelimesindeki 2.a harfinin indeks numarasını gösterir

        //int n3 = str3.indexOf("amm"); bu şekilde "Programming" kelimesi içerisindeki
        //a harfinin indeks nosunu gösterir

        int n3 = str3.indexOf("an");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("gua"); //finds the first matching one form the left to the right
        System.out.println("n4 = " + n4);

        //Sondaki karakterleri bulmak istersek soldan itibaren kontrol etmek çok etkili
        //olmayabilir bu durumda lastIndexOf() metodu kullanılır

        int n5 = str3.lastIndexOf("g"); //indexOf metodunun zıttı olarak sağdan sola
        //kontrol eder ve ilk eşleşen karakterin indeks numarasını gösterir
        System.out.println("n5 = " + n5);

        System.out.println("---------------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1; //Burada C'nin indeks numarasını 1 ile toplarsak
        //yanındaki a harfinin indeks numarasını buluruz bu da başka bir yöntem
        //int fifthA = s.lastIndexOf("va") + 1;
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        //int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);

    }

}
