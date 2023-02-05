package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        // short b = (short)a;
        // arka planda olan bu compiler short un range alanı byte dan
        //zaten büyük olduğu için bunu otomatik olarak atar

        int c = (int)b; // parantez içerisindeki int gri renkte olmasının sebebi
        //otomatik olarak zaten yapılmış olmasındandır
        // int c = (int)b implicit casting otomatik olarak javada yapılır
        //yani double>float>long>int>short>byte bu sıralamada küçük bir primitive data tipini
        //daha büyük bir data tipine atamak istersek implicit casting arka planda
        //otomatik olarak compiler yapar

        long d = c;

        float e = d;
        double f = e;//bütün bu örnekler implicit casting a aittir

        //when you assing a smaller primitive data type to a larger primitive data type
        //implicit casting done automatically
        //but larger primitive types can not directly assigned to smaller primitive types
        //if you want to do that you must do the casting manually this is explicit casting


        System.out.println("-----------------------------------------");


        int x = 55;
        //short y = x; larger ptimitives can
        // NOT be directly assigned to smaller primitive types (need to be casted manually)
        //bu yüzden bu komut hata verir
        short y = (short)x; //explicit casting

        System.out.println(x + " : " + y);

        long j = 1000000;
        //short k = j; short's range is smaller than long's one.So you can not assign casting
                      //automatically.This gives a compile error.
        short k = (short)j;

        System.out.println(j + " : " + k);// çıktı aldığımızda short un range içerisinde
        //1 milyon sayısı olmadığı için 16960 gibi bir rakam çıkar

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);


        double n = 10.8;
        int s = (int)n;// 10.8 will become 10 since the casting is int

        System.out.println(n+ " : " + s);

        System.out.println("-------------------------------------");

        double d1 = 20.5;
        short s1 = (short) d1; //; den sonra Alt + Enter yaparsan intellij sana
                                //alternatif kısayolları gösterir ve otomatik olarak cast
                                //yapabilirsin yani (short) yazdırabilirsin

        //Ya da compiler error aldığında kodun altında çıkan kırmızı çizgiye tıkla
        //sol tarafta bir kırmızı ampül çıkar ona tıklayıp da alternatif çözümleri
        // görebilirsin eğer kısayol kullanmak istemezsen

        System.out.println(d1 + " : " + s1);

        float f1 = 30.5F;
        long l1 = (long) f1;













    }





}
