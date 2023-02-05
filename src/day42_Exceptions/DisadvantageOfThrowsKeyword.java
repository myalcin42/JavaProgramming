package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");

        sleep(2.5); // bu metot içerisindeki checked exception throws keyword ile handle edildiği için çağrıldığında tekrar exception hatası veriyor (throws keywordu kullanmanın dezavantajı)

        System.out.println("Hello world");

        System.out.println("---------------------------------");

        System.out.println("Hello");

        MorningWorkOut.sleep(2.5); //burada ise try&catch ile handle edildiği için çağrıldığında hata vermiyor

        System.out.println("Cydeo");
    }

    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep((long)(seconds * 1000));
    }
}
