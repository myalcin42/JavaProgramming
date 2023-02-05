package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("test started");

        try{
            System.out.println(9/0); // bu unchecked bir exception olduğu için burada sadece test started ifadesi yazdırılır çünkü bu exception hata vereceği için kodun akışını bozar. o yüzden bu exception handle edilmesi gerekir bunun için try&catch bloğu kullanılır

            System.out.println("Try Block");
        }catch(ArithmeticException e){ //try bluğu içerisinde exception oluşacağı için try bloğu atlanır ve catch bloğuna geçilir buradaki ifadeler execute edilir

            System.out.println("Catch block");
            System.out.println("Arithmetic exception was occurred");
        }


        System.out.println("test completed");

        System.out.println("=====================================");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try{ //hata try bloğunun içerisine konulur ve try ve catch birlikte kullanılmak zorundadır
            System.out.println(numbers[200]); // burada array içerisinde 200.indeks olmadığı için runtime esnasında hata verecek ve sonraki kodlar çalışmayacak o yüzden bu unchecked exception handle edilmesi gerekir ki kalan kodlar düzgün çalışsın
            System.out.println("try block");
        }catch (RuntimeException e){ //hangi hata alınıyorsa catch içerisine bu yazılır ve yanına bir variable, genelde e eklenir.ya da kodu çalıştırmadan hangi exception alacağımızı bilmezsek bütün bu unchecked excepiton classlarının parent classı olan "RuntimeException" yazabiliriz.

            e.printStackTrace(); //exceptionla ilgili bütün bilgilere bu metotla ulaşabiliriz // java.lang.ArrayIndexOutOfBoundsException: Index 200 out of bounds for length 5 at day41_Exceptions.TryCatchBlocks.main(TryCatchBlocks.java:29)


            System.out.println(e.getMessage()); //bu metot ise sadece hata mesijını gösterir yani Index 200 out of bounds for length 5
        }



        System.out.println("test2 completed");

        System.out.println("================================================");

        System.out.println("test3 started");

        try{
            System.out.println("Cydeo".substring(2,0));
        }catch (RuntimeException e){

            e.printStackTrace();
        }

        System.out.println("test3 completed");

        System.out.println("==============================================");

        //javada ne zaman bir exception olsa bir object oluşturulur çünkü exceptionlar bir classdır.

        System.out.println("Hello");

        try {
            Thread.sleep(3000); //checked exception çünkü kod yazarken ortaya çıktı checked exception için de try%catch blokları kullanılabilir
        }catch (InterruptedException e){ //InterruptedException bu exception olduğunu nasıl anladık? hatanın üzerinde mouse gezdirince yukarıda yazıyor
            e.printStackTrace(); //runtime exception olmadığı için kod çalıştırılınca herhangi bir detay göstermez yani checked expectionlar için kodu handle eden try metodudur ama catch ile birlikte kullanılması zorunlu olduğu için catch de yazılır

        }

        System.out.println("Cydeo");

        System.out.println("======================================");

        try {
            FileInputStream file = new FileInputStream("file path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
