package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str = "            ";

        boolean R = str.isEmpty(); //Bu metot sonucu doğru ya da yanlış yani
        // boolean olarak döndürür

        System.out.println(R); //burada karakter dizilimi tamamen boşsa yani
        //lenght = 0 ise isEmpty metodu sonucu true olur.Ama space bile olsa false çıkar
        //space bir boşluktur ama karakterdir.

        //isBlank() metodu ise isEmpty() metoduna benzer. str="   " mesela bu ifade de
        //boşluk olduğu için isEmpty metoduna göre boşluk da olsa içerisinde karakter
        //vardır ve sonuç false çıkar yani empty değildir.Ama bu ifade de boşluk dışında
        //bir karakter olmadığı için isBlank() metoduna göre sonuç true çıkar

        boolean r1 = str.isBlank();
        System.out.println(r1); //true çıkar  str = "            "; boşluk vardır ama hepsi
        //space dir.

        String str2 = "Cydeo     ";
        System.out.println(str2.isBlank()); //false (not blank)
        //isBlank metodu da JDK 11 ve sonrasında çalışır

        System.out.println("--------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); //burada büyük küçük harf duyarlılığından dolayı
        //s1 ve s2 eşit değildir ve sonuç false olur

        System.out.println(s1.equalsIgnoreCase(s2));//burada da sadece ifadelerin içeriği
        //karşılaştırılır, büyük küçük harf duyarlılığı yoktur. true olur


        System.out.println("--------------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#"); //contains() metodu da parantez
        //içerisinde belirtilen ifadenin karakter dizilimi içerisinde olup olmadığına
        //bakar.Sonuç ya true ya da false olur //false
        boolean hasJava = sentence.contains("Java"); //true
        boolean hasJava2 = sentence.contains("java"); //false olur çünkü büyük küçük
        //harf duyarlılığı vardır ve contains metoduyla birlikte equalsIgnoreCase metodu
        //kullanılmaz eğer istenen ifadenin case sensitive durumuna takılmamasını istersek;

        boolean hasJava3 = sentence.toLowerCase().contains("java");
        //Bu şekilde yapılabilir.Başka yolu yoktur ya uppercase ya da lowercase
        System.out.println(hasCSharp);//false
        System.out.println(hasJava);//true
        System.out.println(hasJava2);//false
        System.out.println(hasJava3);//true

        System.out.println(sentence);

        System.out.println("------------------------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2)); //false

        System.out.println(input1.contains(input2)); //true


        System.out.println("----------------------------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        System.out.println(x);//true eğer bir ifadenin belirtilen karakter dizilimiyle
        //başlayıp başlamadığını bulmak istersek startsWith() metodu kullanılır.
        //Boolean olarak döner ve case sensitive özelliği vardır

        boolean y = a.endsWith("Spoon"); //endsWith() metodu startsWith metodunun
        //tam tersidir ve aynı özelliklere sahiptir

        boolean z = a.toLowerCase().startsWith("wooden"); //bu şekilde yapılabilir
        //önce küçük harfe çevirip sonra kotrol etme




    }


}
