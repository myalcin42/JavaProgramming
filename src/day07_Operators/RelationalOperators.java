package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // > , >= , < , <=
        boolean result1 = 200 > 40; // result is true (greater than operator)
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; // true (greater than or equal)(iki şarttan birisi sağlanırsa)

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100; // true (iki şarttan birisi sağlanırsa true)

        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500; //false iki şartı da sağlamıyor

        System.out.println("result4 = " + result4);

        // credit score of 720 in order to get a loan
        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720; //if the credit score is 720
        //or greater, then it is eligible for the credit

        boolean result5 = 100 < 120; //true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 < 180; //false
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFailed = score <= 59; //Less than or equal true
        System.out.println("hasFailed = " + hasFailed);


        boolean result7 = 45 <= 60; //true
        System.out.println("result7 = " + result7);

        System.out.println("================================================");

        // = bir tane eşittir işareti javada assignment için ayrıldığından
        // eşitlik ibaresi için == bu kullanılır.Aynı data tipinde iki değerin karşılaştırılması için

        int x = 100;
        int y = 200;//bu iki değerin eşit olup olmadığını anlamak için == kullanılır

        boolean equal = x==y; //false
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; //false String için de kullanılabilir
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; //java is a case sensitive language false olur

        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; //true
        System.out.println("result10 = " + result10);

        boolean result11 = "Java  " == "  Java    "; //false boşluklar da karakterdir
        System.out.println("result11 = " + result11);

        System.out.println("=======================================");

        //Not equal ibaresi != için bu işaret kullanılır

        boolean result12 = 100 != 200; // true iki data tipinin de aynı olması gerekir
                                        // you can not compare number with string
        System.out.println("result12 = " + result12);

        boolean result13 = "Java" != "Break"; // true
        System.out.println("result13 = " + result13);

        boolean result14 = 300 != 300; //false
        System.out.println("result14 = " + result14);









    }


}
