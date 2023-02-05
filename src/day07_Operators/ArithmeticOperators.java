package day07_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 6;

        int division = num1 / num2;
        int remainder = num1 % num2;
        //10 divide by 3 is equal to 3 with a remainder of 1

        System.out.println(num1 + " divided by " + num2 + " is equal to " +
                division + " with a remainder of " + remainder );

        //what is the remainder of 25 divided by 4
        System.out.println(25 % 4);

    }

}
