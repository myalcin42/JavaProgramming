package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {

    public static void method(){
        try {
            method1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws FileNotFoundException {

        new FileInputStream("");
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method3() throws FileNotFoundException, InterruptedException {
        method2();
        Thread.sleep(1000); // iki tane ayrı exception var
    }

    public static void method4() throws FileNotFoundException, InterruptedException {

        method3();  // method 3 ü çağırdığımızda iki tane excepiton hatası alırız çünkü iki exceptionda method 3 de throws keyword(geçici çözüm) ile handle edildi
    }
}
