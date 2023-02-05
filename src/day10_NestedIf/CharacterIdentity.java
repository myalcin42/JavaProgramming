package day10_NestedIf;

public class CharacterIdentity {

    public static void main(String[] args) {
        char ch = 'd'; // ya da Ascıı table dan karakterlerin karşılığı numaralar bulunarak
        //da yapılabilir

        if(ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Alphabetic");
        }else{
            System.out.println("Special Character");
        }


    }





}
