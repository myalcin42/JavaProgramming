package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();//Bu görevde kullanıcıdan bir numara girmesini istiycez ve girdiği numara kaç tane numara girmesini istediğini belirtecek bu yüzden buradaki numara Arrayın range olacak

        if(length <= 0){
            System.err.println("Invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[length]; // array needs to have enough capacity to contain all the elements user going to enter
        //Mesela kullanıcı 10 sayısını girdi kullanıcıdan 10 kere rakam girmesini istemek için aşağıdaki loop döngüsü kullanılır ve girdiği her rakamı Array içerisinde muhafazaq etmek istediğimiz için numbers[i]  = scan.nextInt(); Array içerisine bu şekilde atama yaparız
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i]  = scan.nextInt(); // each input user provided during each execution of the loop, will be assigned to the indexes of the Array
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();

    }


}
