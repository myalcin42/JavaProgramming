package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 30 , b = 7;
        int count = 0;

        while(a >= b){
            a -= b;
            count +=1; //count++ ya da böyle
        }

        System.out.println(count + " with the remainder of " + a);
    }



}
/*
1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators
 */