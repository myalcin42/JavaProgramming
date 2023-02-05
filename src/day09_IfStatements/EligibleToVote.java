package day09_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        int age = 16;
        boolean isEligibleToVote= age >= 18;

        if(isEligibleToVote){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }



    }




}
