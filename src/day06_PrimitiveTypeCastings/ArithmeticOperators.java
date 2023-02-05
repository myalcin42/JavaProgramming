package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1);//121, Concatenation
                                        // en az bir tane String olacak
        System.out.println(10 + 20); //30, Addition
        System.out.println(100 - 50);//50, Subtraction
        System.out.println(10 * 6);    //60, Multiplication

        System.out.println(100 / 3);//bu şekilde java çıktısı sadece 33 olur
        //Eğer ondalık bir çıktı almak istiyorsak
        System.out.println(10.0 / 4);//bu şekilde yapabiliriz birisi ondalık olursa
        System.out.println(10 / 4.0);// ya da bu şekilde
        System.out.println(10d / 4);//Ya da bir rakamın arkasına küçük ya da büyük d harfi


        int a = 100;
        double b = a/6; //a ve 6 iki integer sayı 100/6 normalde 16.6666
                        // ama sonucu b değişken ismiyle double data tipine
                        // atadığımız için çıktı 16.0 olur
        System.out.println(b);

        double c = a/6d;

        System.out.println(c);

        double t = a/6d;
        System.out.println(t);

        double j = (double)a/6;

        System.out.println(j);

        System.out.println( 100D );//100.0 olarak çıktı verir bir sayıdan sonra D ya da d
                                    //görürsen o ondalık haline dönüşür


    }



}
/*
+:addition
-:substraction
*:multiplication
/:division

        integer / integer ====> integer
        decimal / integer ====> decimal
        integer / decimal ====> decimal
        decimal / decimal ====> decimal

        in math:
            10/4 = 2.5        in java:
            10/4 = 2 çünkü iki sayı da integer
            o yüzden bir tanesi decimal olarak atanmak zorunda
%:remainder
 */