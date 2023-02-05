package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {
        //exception is an abnormal condition. In Java, an exception is an event that disrupts the normal flow of the program.there are two types of exception: checked and unchecked
        //unchecked exception: kod yazarken anlaşılmayan runtime esnasında ortaya çıkan exception
        int a = 10;
        int b = 0;

     //   System.out.println(a/b); //ArithmeticException hatası alırsın.runtime esnasında ortaya çıkar herhangi bir sayının 0 a bölümü tanımsızdır ama compile ederken bu hata alınmaz kod çalıştırılınca anlaşılır işte böyle bir exceptionı handle etmezsek müteakip kodlar çalışmaz o yüzden önemli(akışı bozuyor)

        char[] characters = {'A', 'B', 'C'};

    //    System.out.println(characters[99]); // burada 99.indeks characters arrayinde bulunmamasına rağmen kodu yazarken compiler bunu bilemez ve hata vermez ama kod çalışınca ArrayIndexOutOfBoundsException hatası alınır.bu bir exception hatasıdır ve runtime esnasında ortaya çıktığı için unchecked exception' dır.bütün bu exceptionlar java.lang paketi içerisindedir.

        Student student = null;

     //   System.out.println(student.getName()); //NullPointerException

      //  student.study();  //NullPointerException çünkü object null değeri atandı yani oluşturulmuş bir object yok aslında

        final String str = "Wooden Spoon"; // garbage collectiona gitmesini istemediğimiz variablelar için final kullanabiliriz ki null değerine atanmasın

    //    str = null;

    //    System.out.println(str.toUpperCase()); //NullPointerException

       //checked Exception:they occur during the compile time while writing the code.syntax errorlar buna dahil değildir mesela ; yazmamak bir compiler errordur ama exception değildir

        System.out.println("Hello");

      //  Thread.sleep(3000); //bu metot hata veriyor, checked exceptiona örnek.bu yüzden hemen düzeltilmesi gerekir çünkü kodu çalıştıramazsın

        System.out.println("Cydeo");

   //   FileInputStream file = new FileInputStream("path of the file"); // Unhandled exception: java.io.FileNotFoundException

        //Errors : javada runtime esnasında ortaya çıkan diğer bir istenmeyen durum ise errors dur ama bunu compile error ile karıştırma bu durumlarla çok karşılaşılmaz ve handle edilemez bu yüzden sadece bil. en yaygını outofmemory hatasıdır


    }
}
