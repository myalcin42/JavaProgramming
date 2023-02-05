package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {
        //replae() metotu eski değer ile yeni değeri değiştirir kısaca

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");
        //"Python is fun, I love learning Python"

        System.out.println("str = " + str);//Java is fun, I love learning Java
        System.out.println("str2 = " + str2);//Python is fun, I love learning Python

        String email = "JohnSmith@yahoo.com"; //yahoo uzantısını gmail ile değiştir
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email); //JohnSmith@gmail.com

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        //Bu cümledeki Python ifadelerinin hepsini çıkarmak istersek;

        String sentence2 = sentence.replace("Python" , "");
        //Böylece Python kelimelerinin yerine boş String atayarak onları cümleden çıkardık
        System.out.println("sentence2 = " + sentence2);
        sentence2 = sentence2.replace("   " , " ");
        //Kalan boşlukları tek bir boşluk ile değiştirdik
        System.out.println("sentence2 = " + sentence2);
        //Bunu yazdırdığımızda çıktıda "Java Java  C# C# C++ C++" ifadesi görünür.Burada
        //Java  C# kelimeleri arasında iki tane boşluk karakter var eğer onu bir tek boşlukla
        //değiştirmek istersek yukarıdaki replacement ifadesinin yanına bir replacement
        //ifadesi daha eklenebilir ===> replace("  " , " ")

        String s = "Dog Dog Dog Dog Dog Dog";
        s= s.replace("Dog", "Cat");

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";//Mesela burada ikinci C# ifadesini Java ile
        //değiştirmek istersem
        //s2.replace("C#", "Java"); Bu şekilde yazarsam iki C# ifadesini de değiştirir ama
        s2 = s2.replace(" C#", " Java");//Böyle 2.C# ifadesini tarif etmek için
        //boşluk bırakıp belirtirsem orayı değiştirir yeni kelimeyi de aynen boşluk ve
        //sonraında kelime yani aynı formatta yazarım ya da
        //s2.replace("C# is c", " Java is c"); yani aynı formatta yazılır

        System.out.println("s2 = " + s2);

        String s3 = "Java";

        s3 = s3.replace("a" , "e"); //Bu şekilde tek bir karakter
        // de değiştirilebilir

        System.out.println("s3 = " + s3);

        System.out.println("-------------------------------------------");

        //replaceFirst() metodu sadece ilk eşleşen kelimeyi değiştirir

        String result = "Java Java Java";
        result = result.replaceFirst("Java" , "Python");
        //replaceFirst() metodunda sadece ilk java kelimesi değiştirilir yani soldan
        // itibaren ilk eşleşen
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";//Sadece ilk C# değiştir
        result2 = result2.replaceFirst("C#" , "Java");
        System.out.println(result2);

        String result3 = "Java";// sadece ilk a yı değiştirmek istersek
        result3 = result3.replaceAll("a" , "o");
        System.out.println(result3);

        //result3 = result3.replaceAll("va" , "vo"); //Sadece 2.a harfini değiştirmek
        //istersem bu şekilde de yapılabilir




    }


}
