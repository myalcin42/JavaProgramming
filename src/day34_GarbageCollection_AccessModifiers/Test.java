package day34_GarbageCollection_AccessModifiers;

import utilities.MathUtility;

import static utilities.MathUtility.sumOfNumbers;

public class Test {

    public static void main(String[] args) {
        System.out.println(Circle.pi); // all the static variables are set when we call them because static block can gets executed even outside of the class automatically. whenever you call any static variable the block will be loaded
        //Constructor sets all the instances and the static block sets all the statics
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("===============================================");

        //find the sum of 10,20
        int r1 = sumOfNumbers(10,20);
        System.out.println(r1); //30

        //find the sum of 100,200
        int r2 = sumOfNumbers(100,200);
        System.out.println(r2); // 300

        MathUtility.subtractionOfNumbers(100,50);//sadece sum metodunu import ettiğimiz için subtract metodunu class aracılığıyla çağırabiliriz

    }
}
