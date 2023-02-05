package day11_Switch_Scanner;

import java.util.Scanner; //Javada paket dışı class ları çağırmak için import komutu kullan

public class ScannerIntro {//Scanner kısaca to get the user input için kullanılır

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Eğer Scan yazıp enter yaparsak yukarıdaki
        //import java.util.Scanner; ifadesi otomatik olarak oraya gelir
        //Sadece bu ifadeyi çalıştırırsan konsolda bişey yazamazsın
        //Eğer yazmak istiyorsan Scanner Methods kullanacaksın.Aşağıdaki gibi

        System.out.println("Enter an integer: ");//Scanner kullandığın zaman konsolda veri
        //girmen gerekir burada bu print ifadesinden sonra girdiğin değeri yazdırır
        //Aşağıda belirttiğimiz ifadeden dolayı
        int num1 = input.nextInt(); //Bu şekilde çalıştırırsak konsola bir değer girebiliriz
                         //Bu datayı bir data tipine atayabiliriz

        System.out.println("Enter a decimal: ");

        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: " + (num1 * num2));

        input.close(); //closes the scanner.Bunu yapmazsak hata vermez ama scanner
        //arka planda çalışmaması için ve programı hızlandırmak adına yapılr.Bu ifadeden
        //sonra scanner çalışmaz.mesela bu ifadeden sonra aşağıdaki kodu yazarsak çalışmaz

        System.out.println("Enter an integer: ");

        int num3 = input.nextInt();

        System.out.println(num3);
    }


}
