package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Burada scan variable name yerine input da
        //kullanılabilir ama Muhtar scan kullanmayı tavsiye etti

        System.out.println("Enter the radius of the circle");

        double r = scan.nextDouble(); // buradaki scan kelimesi ile yukarıdaki variable name
        //olan scan aynı dikkat et yukarıda başka isim kullanırsan bu da aynı olmak zorunda
        double area = r * r * 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        scan.close();
        
        int b = 35 % 60;
        System.out.println("b = " + b);



    }


}
/*
 1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */