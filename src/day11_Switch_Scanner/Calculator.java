package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
            double n1 = 200.5, n2 = 10.5;
            char operator = '+';
            boolean validOperator = operator == '+' || operator == '-'
                    || operator == '*' || operator == '/';

            if(validOperator){ //bu ön koşul doğruysa dört olasılık var +,-,*,/

                switch(operator){  //switch(n1) diyemeyiz çünkü n1 double data tipindedir

                    case '+'://case bloku içerisinde bütün data tipleri kullanılabilir(n1 boolean)
                             //ama switch() parantez içerisinde ve case' in  yanında kullanılan
                             //data tipleri aynı türde olmak zorundadır ve long double float
                            // ve boolean olamaz
                        System.out.println(n1 + n2);
                        break;
                    case '-':
                        System.out.println(n1 - n2);
                        break;
                    case '*':
                        System.out.println(n1 * n2);
                        break;
                    default:
                        System.out.println(n1 / n2);
                }


            }else{
                System.err.println("Invalid Operator: " + operator);// serr kısayolu
                //hatalı yazdırma kırmızı fontta daha önce yapmıştık
            }





    }

}
/*
given two double variables n1, n2 and a char variable named operator
use switch statement to calculate the result of n1 & n2 based on the given operator
valid operators are : -, +, *, /
 */