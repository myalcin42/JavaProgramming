package day17_While_DoWHile;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        //username: "Cydeo"
        //password : "Cydeo123" //3 kere yanlış girerse hesabı kilitle

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("Cydeo123")){ //if credentials are valid
            System.out.println("Logged in");
        }else{ //if credentials are not valid
            int attempts = 3; // 3 hakkı var
            while( ! (u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0){
                                                                    //Bu ifadeyi
                //kullanmazsak doğru kullanıcı adı ve şifreyi girene kadar giriş yapabilir
                //while the credentials are invalid and the user has still attempt
                if(attempts == 1){
                    System.err.println("This is your last chance");
                }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempts--; //her hatalı girişte bu rakam 1 azalır ki sadece 3 hatalı giriş yapabilsin(Bu while looptan sonra iki ihtimal daha var ya kullanıcı başarılı bir şekilde giriş yapabilecek ya da hesabı kilitlenecek
            }

                    if(u.equals("Cydeo") && p.equals("Cydeo123")){
                        System.out.println("Logged in");
                    }else{
                        System.out.println("Your account is locked");
                    }

        }
        scan.close();





    }



}
/*
2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked.
 */