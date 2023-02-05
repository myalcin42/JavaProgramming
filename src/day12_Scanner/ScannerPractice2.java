package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //System.out.println("Enter true or false");
        //boolean result = input.nextBoolean(); //nextBoolean metodunda sadece true ya da
        //false yazılabilir başka bir kullanım şekli de yoktur

        System.out.println("Enter your name: ");
        String name = input.next(); //next metodu String ifadelerde kullanılır
        //ama bu metod yazılan metni ilk space tuşuna kadar okur.Yani ali veli varsa sadece tek
        //ali konsolda çıkar.Bu yüzden iki kelime varsa bu metod kullanılmaz.O yüzden tek bir
        //kelime varsa ya da birkaç kelime bile olsa arada space(boşluk) yoksa kullanılabilir
        //ama Wooden_Spoon arada space olmadığı için çıkar

        System.out.println("name = " + name);

        input.close();
    }


}
