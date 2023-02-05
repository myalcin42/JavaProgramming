package day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws ArithmeticException {

        System.out.println(8 / 0); // unchecked exceptionlar throws keyword ile handle edilmez yukarıda throws yazılsa bile unchecked exception hatası devam eder o yüzden unchecked exception için try&catch bloğu kullanılır

        System.out.println("test completed");
    }
}
