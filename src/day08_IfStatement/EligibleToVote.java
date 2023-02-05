package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

       String name = "Josh";
       int age = 38;
       String citizen = "USA";

       boolean isEligible = age >=21 && citizen == "USA";
       //Eligible for vote
        if(isEligible){  // bu koşul sağlanırsa bu if kümesinin içerisindeki çıktı olur

            System.out.println("Eligible");
        }

        //not eligible for vote
        if(!isEligible){  //bu koşul sağlanırsa bu if kümesinin içerisindeki çıktı olur

            System.out.println("Not Eligible");
        }

    }


}
