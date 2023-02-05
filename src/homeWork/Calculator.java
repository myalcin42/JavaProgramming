package homeWork;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 10, n2 = 20;
        char mathOperator = ',';

        if (mathOperator == '+'){
            System.out.println(n1 + n2);
        } else if (mathOperator == '-') {
            System.out.println(n1 - n2);
        } else if (mathOperator == '*') {
            System.out.println(n1 * n2);
        } else if (mathOperator == '/') {
            System.out.println(n1 / n2);
        }else{
            System.out.println("Invalid operator");
        }


    }




}
