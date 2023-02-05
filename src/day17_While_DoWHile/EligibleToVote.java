package day17_While_DoWHile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt(); //valid age: 1 - 120
        //mesela burada kullanıcı -20 gibi bir rakam girerse tekrar girmesini istemek zorundayız ve kullanıcının kaç defa yanlış giriş yapacağını bilmediğimiz için bu durumda while loop kullanabiliriz.while loop tekrarlanan ifadenin kaç defa tekrarlanacağını bilmediğimiz zaman kullanılır

        while( ! (age >=1 && age <= 120)){ // while the age number is invalid
            System.out.println("Invalid entry, please re-enter");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");
        String answer = scan.next();

        while( ! (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid entry, please re-enter");
            answer = scan.next();
        }

        if(age >= 18 && answer.equalsIgnoreCase("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

}
