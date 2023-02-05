package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        System.out.println(true == !false); // true
        System.out.println(!true != false); //false
        System.out.println(!false == true); //true

        System.out.println(!!false); //false
        System.out.println(!!!true); //false

        System.out.println("-----------------------------------------");

        int score = 85; // 0 - 100

        boolean a = score >= 90 && score <= 100; // A notu olması için hem 90 dan eşit ya da
                                                // büyük hem de 100 e eşit ya da küçük olacak
        boolean b = score >=80 && score <= 89; //boolean b = score >=80 && !a;
                                                 //bu şekilde de yazılabilir
        boolean c = score >= 70 && score <= 79; //boolean c = score >= 70 && !a && !b;
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <=59;
        // ya da boolean f = !a && !b && !c && !d;

        if(a) { // yani öğrenci A notu olursa Excellent çıktı olur

            System.out.println("Excellent");

        }
        if(b) {
            System.out.println("Great");
        }
        if(c) {
            System.out.println("Good");
        }
        if(d) {
            System.out.println("Passed");
        }
        if(f) {
            System.out.println("Failed");
        }






    }


}
/*
90 - 100 ==> Excellent
80 - 89 ==> Great
70 - 79 ==> Good
60 - 69 ==> Passed
0 - 59 ==> Failed

 */