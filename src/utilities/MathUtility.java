package utilities;

public class MathUtility {

    public static void main(String[] args) {

        int result = sumOfNumbers(5,10);
        System.out.println(result);

        boolean isEven = isEvenNumber(5);
        System.out.println(isEven);

        int max = maxNumber(20,30);
        System.out.println(max);

        System.out.println("================================");

        double result1 = squareOfANumber(5.6);
        System.out.println(result1);
    }


    //Create a method that can return the sum of two integers
    public static int sumOfNumbers(int num1 , int num2){

        return num1 + num2 ;
    }

    //Create a method that can return the sum of two decimal numbers
    public static double sumOfNumbers(double num1 , double num2){

        return num1 + num2 ;
    }


    //Create a method that can return the subtraction of two integers
    public static int subtractionOfNumbers(int num1 , int num2){
        return num1 - num2;
    }

    //Create a method that can return the subtraction of two decimals
    public static double subtractionOfNumbers(double num1 , double num2){
        return num1 - num2;
    }

    // Creata a method that can return the multiplication of two integers
    public static int multiplicationOfNumbers(int num1, int num2){
        return num1 * num2;
    }

    //Creata a method that can return the multiplication of two decimals
    public static double multiplicationOfNumbers(double num1, double num2){
        return num1 * num2;
    }

    //Create a method that passes two double parameters and return the division result
    public static double divisionOfTwoDouble(double num1 , double num2){
        double result = num1 / num2;
        return result;
    }

    //Create a method that can check if an integer is even number
    public static boolean isEvenNumber(int num){
        return (num % 2 == 0)? true : false;
    }

    //Create a method that can check if an integer is odd number
    public static boolean isOddNumber(int num){
        return (num % 2 != 0)? true : false;
    }


    //Create a method that can return the maximum number between two integers
    public static int maxNumber(int num1 , int num2){
        return (num1 > num2)? num1 : num2;
    }


    //Create a method that can return the maximum number between two decimal numbers
    public static double maxNumber(double num1 , double num2){
        return (num1 > num2)? num1 : num2;
    }

    //Create a method that can return the minimum number between two integers
    public static int minNumber(int num1, int num2){
        return (num1 < num2)? num1 : num2;
    }

    //Create a method that can return the minimum number between two decimal numbers
    public static double minNumber(double num1, double num2){
        return (num1 < num2)? num1 : num2;
    }


    //Create a method that can return the square of an integer
    public static int squareOfANumber(int num){
        int result = (int) Math.pow(num, 2);
        return result;
    }

    //Create a method that can return the square of a double
    public static double squareOfANumber(double num){
        double result = Math.pow(num, 2);
        return result;
    }

    //Create a method that can return the cube of an integer
    public static int cubeOfANumber(int num){
        int result = (int) Math.pow(num ,3);
        return result;
    }

    //Create a method that can return the cube of a double
    public static double cubeOfANumber(double num){
        double result = Math.pow(num ,3);
        return result;
    }










}
/*
1. Create a class called MathUtility under the utility package:

			2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers

			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals

			2.5 Creata a method that can return the multiplication of two integers
			2.6 Creata a method that can return the multiplication of two decimals

			2.7 Create a method that passes two double parameters and return the division result

			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number

			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double

 */