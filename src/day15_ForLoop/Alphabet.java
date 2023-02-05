package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {
        //print A to Z ===> ilk yol Ascıı table dan bu karakterlere karşılık gelen
        //numaraları bularak yapmak ya da char data tipiyle yapılabilir

        for (int i = 65 ; i <= 90 ; i++){
            System.out.print( (char) i + " "); //char tipine atamazsan numara olarak
            //çıktıda gözükür
        }

        System.out.println();

        for(char i = 'A' ; i <= 'Z' ; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("------------------------------------------------");

        //a dan z ye yazdır

        for(char i = 'a' ; i <= 'z' ; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------");

        //Z den A ya kadar yazdır

        for (char i = 'Z' ; i >= 'A'; i--){
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("--------------------------------");

        for (char i = 1 ; i <= 40000 ; i++){
            System.out.print(i + " ");
        }



    }

}
