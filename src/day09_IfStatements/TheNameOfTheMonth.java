package day09_IfStatements;

public class TheNameOfTheMonth {

    public static void main(String[] args) {

        int number = 12;
        String monthName;

        if (number == 1){
            monthName = "January";
        } else if (number == 2) {
            monthName = "February";
        } else if (number == 3) {
            monthName = "March";
        } else if (number == 4) {
            monthName = "April";
        } else if (number == 5) {
            monthName = "May";
        } else if (number == 6) {
            monthName = "June";
        } else if (number == 7) {
            monthName = "July";
        } else if (number == 8) {
            monthName = "August";
        } else if (number == 9) {
            monthName = "September";
        } else if (number == 10) {
            monthName = "October";
        } else if (number == 11) {
            monthName = "November";
        }else{
            monthName = "December";
        }

        System.out.println("The month is = " + "\"" + monthName + "\"");
    }




}
