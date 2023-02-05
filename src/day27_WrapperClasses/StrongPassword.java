package day27_WrapperClasses;

import java.util.Scanner;

public class StrongPassword {

    public static void main(String[] args) {

        String str = "TalhaOzcan123";

        int digit = 0, upper = 0, lower = 0, special = 0;

        if(str.length() >= 8 && !str.contains(" ")) {

            for (char each : str.toCharArray()) {

                if (Character.isDigit(each)) {
                    digit++;

                } else if (Character.isUpperCase(each)) {
                    upper++;

                } else if (Character.isLowerCase(each)) {
                    lower++;

                } else if (!Character.isLetterOrDigit(each)) {
                    special++;

                }

            }// for each loop

            if(digit > 0 && upper > 0 && lower > 0 && special > 0)
                System.out.println("Valid");
            else
                System.out.println("Invalid");

        }else {
            System.out.println("Password MUST be at least have 8 characters long, and should not contain space");
        }
    }


}
/*
Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit

 */