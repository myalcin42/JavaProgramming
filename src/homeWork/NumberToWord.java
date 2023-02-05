package homeWork;

public class NumberToWord {

    public static void main(String[] args) {

       int number =0;
       String word;
       
       if (number ==1){
            word = "One";
       } else if (number == 2) {
           word = "Two";
       } else if (number == 3) {
           word = "Three";
       } else if (number == 4) {
           word = "Four";
       } else if (number == 5) {
           word = "Five";
       } else if (number == 6) {
           word = "Six";
       } else if (number == 7) {
           word = "Seven";
       } else if (number == 8) {
           word = "Eight";
       } else if (number == 9) {
           word = "Nine";
       }else{
           word = "Zero";
       }
        System.out.println("Word is = " + "\"" + word + "\"");

    }




}
