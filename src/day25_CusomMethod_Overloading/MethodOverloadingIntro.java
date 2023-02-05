package day25_CusomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};
        Arrays.sort(intArray);     //mesela sort metodunun işlevini biliyoruz.ve sort yazınca intellij bize birçok seçenek sunar.Farklı metotlar olmasına rağmen aynı işlevi gördüğü için tek bir isim vardır.Bu yüzden sort metodu overloaded bir metottur.Multiple different methods sharing the same method name(method overloading)
        double[] doubleArray = {10.5,11.5,5.5,4.5};
        Arrays.sort(doubleArray);
        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(charArray);

        System.out.println("==============================");
        //sum of 10 and 20
        int sum1 = sumOfNumbers(10,20); //sumOfNumbers yazdığın zaman intellij bütün seçenekleri önüne getirir.farklı ama aynı işleve sahip bütün metotları aynı isim altında topladığın için(method overloading) sadece parametrelere göre değişkenlik gösterir

        //sum of 10,20,30
        int sum2 = sumOfNumbers(10,20,30);

        // sum of 10,20,30,40
        int sum3 = sumOfNumbers(10,20,30,40);

        //sum of 18.2 and 30.7
        double sum4 = sumOfNumbers(18.2, 30.7);

        //sum of 5.5, 6.5, 4.5;
        double sum5 = sumOfNumbers(4.2, 5.4, 6.5);

    }
    //Mesela aşağıdaki metotlar farklı metotlar olmasına rağmen fonksiyonel olarak aynı işlemi yaparlar.Farklı metot olmalarına rağmen aynı metot ismi verilebilir(method overloading =  Multiple methods having the same method name)Method overloading için metot sayısında sınır yoktur.İki farklı metot için parametreler farklı değilse aynı metot ismini veremezsin.Yani method overloading yapamazsın
    public static int sumOfNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1,int num2,int num3){
        return sumOfNumbers(num1, num2) + num3;
    }

    public static double sumOfNumbers(double num1,double num2,double num3){
        return sumOfNumbers(num1, num2) + num3;//başka bir metodu başka bir metotta çağırabilirsin
    }

    public static int sumOfNumbers(int num1,int num2,int num3, int num4){
        return sumOfNumbers(num1, num2, num3) + num4;  //bu şekilde de yazılabilir
    }

    public static double sumOfNumbers(double num1,double num2,double num3, double num4){
        return sumOfNumbers(num1, num2, num3) + num4; //bu şekilde de yazılabilir
    }
    
    

}
