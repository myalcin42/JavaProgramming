package day13_StringClass;

//import java.lang.String; //This lang package is very special.It is imported automatically
//by java. That is because if it is not imported by this statement it does not give any
//compile error

public class StringIntro {

    public static void main(String[] args) {

        String name = "Wooden Spoon"; //import java.lang.String; bunu yukarıda
        // belirtmememize rağmen hata vermiyor ama Scanner olsaydı hata verirdi.
        // Bu yüzden lang paketi implicitly
        //import edilir diğer paketler manuel olarak import edilmek zorundadır
        //"Wooden Spoon" bu ifade java heap denen yerde saklanır yani hafızada.
        //object ler heap de saklanır ama local variables Stack denen yerde saklanır!!!!!
        //String ifadeler yani "Wooden Spoon" bunun gibi String literal ifadeler bu Heap
        // içerisinde bulunan String Pool da saklanır ama String name ifadesinde geçen
        //name variable ismi Stack de depolanır.Burada geçen "Wooden Spoon" ifadesi
        //aslında bir String object' dir.String objects are called String literals
        //işte bu String literals Heap içerisinde bulunan String Pool bölümünde saklanır.

        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";
        //Burada oluşturulan String object niteliğindeki String literallerin(sequence
        // of characters) hepsi aynı
        //"Wooden Spoon". Java Heap de bulunan String Pool içerisinde sadece bir tane
        //depolanır çünkü String Pool kopya objeleri depolamaz sadece bir tane "Wooden Spoon"
        //depolanır.

        System.out.println(name  == name2); // true
        System.out.println(name2 == name3); // true
        System.out.println(name3 == name4); // true

        //şimdiye kadar String de String name2 = "Wooden Spoon"; bu şekilde object
        //oluşturduk.Ama object oluşturmak için bir yol daha bulunmaktadır.

        System.out.println("--------------------------------");

        //String str1 = new String("Java");
       // String str2 = new String("Java");
        //Bu şekilde new objesi kullanarak oluşturulan ifadeler, aynı sequence of characters
        //bile olsa (örnekte "Java" ikisi de) bu ifade String Literal ifade olmadığı için
        //String pool dışında depolanır farklı iki obje olarak.Bu yüzden bu iki ifade
        //içerisinde bulunan Java ifadeleri aynı gözükse bile aslında farklıdır

        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        //Bu ifadeler new ile oluşturulduğu için hepsi ayrı olarak depolanır.Aynı karakter
        //dizilimine sahip olsalar bile farklıdır

        System.out.println(str1 == str2);//Hepsi false olur yukarıdaki açıklamaya binaen
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);

        System.out.println("---------------------------------------------");

        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1.equals(s2) ); //karşılaştırma // true olur

        String s3 = "Java";
        String s4 = new String("java");
        System.out.println(s3.equals(s4) ); // since java is a case sensitive language false
        //Bundan sonra karşılaştırmalar == operatörü ile değil equals metodu ile yapılacak
        //equals operatörü sadece visible text karşılaştırması yapar yani yazılan textin
        //aynı olup olmadığına bakar.Nerede depolanmış olduğu karşılaştırmasını yapmaz

        // String s1 = "Cat"; Bu iki String objecti ""(double quote) kullandığımız
        //için literal kullanarak oluşturduk.new objesini kullansaydık String literal
        //olmayacaktı.Eğer bu String literal ise Java Heap içerisindeki String poolda
        //depolanır.Ama bu ikisi de aynı karakter dizilimine sahip olduğu için String poolda
        //sadece bir tanesi depolanır o yüzden == ile kıyaslarsak aynı olduğu çıktısı verir
        // String s2 = "Cat";
        //ama String s3 = new String("Cat"); bu new keyword ile oluşturulduğu için
        //String literal olmaz ve Heap dışında depolanır(String poolda değil)
        //O yüzden s1 == s3 karşılaştırması false olarak çıkar
        //O yüzden bu s1 ve s3 karşılaştırmasını depolandıkları yere göre
        // değil de sadece içerdikleri karakter dizilimine göre yapmak istersek == bunu
        // değil equals metodunu kullanacağız.!!!!!!*********

        //String de her karakter diziliminin bir indek numarası vardır ve soldan itibaren
        //sıfırdan başlar "java" indeks numaraso 01232'tür.

        /*
        String methods:

       charAt(index) : returns the character at the given index, returns char
       "java" kelimesi için charAt(2) yazdığımızda 'v' harfini çağırır.
         */







    }


}
