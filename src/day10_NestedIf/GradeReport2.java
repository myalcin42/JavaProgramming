package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
            //ternary ile yapma
        int score = 95;//score variable name değiştirmek istersek Ctrl + R kısayolu kullan

        if(score >= 0 && score <=100){

            if(score >= 90){
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{
            System.out.println("Invalid Score");
        }

        System.out.println("--------------------------------------------");

        String result = (score >= 0 && score <=100) ? (score >= 90) ? "Excellent" :(score >= 80)? "Great"
           :(score >= 70)? "Good" :(score >= 60)? "Passed" : "Failed" : "Invalid Score";
        //Nested if görevinde ternary tavsiye edilmiyor ama bir çözüm daha var aşağıda
        //karışım yapmak

        System.out.println("-----------------------------------------------------");

        //Karışım yaparken pre condition olduğu gibi yazılır içerisinde bulunan if ifadeleri
        //ternary ile ifade edilir.Bu daha sağlıklı bir yöntemdir

        String result2 = "";

        if(score >= 0 && score <=100){

            result2 = (score >= 90) ? "Excellent" :(score >= 80)? "Great"
                    :(score >= 70)? "Good" :(score >= 60)? "Passed" : "Failed";

        }else{
            result2= "Invalid Score";
        }
        System.out.println(result2);
        //Örnekte görüldüğü üzere pre condition ifadesi ve ona ait else ifadesi ternary
        //kullanılmadan ifade edildi ama içerisinde bulunan if ifadesi ternary ile ifade
        //edildi(mixing yaptık yani)
    }



}
