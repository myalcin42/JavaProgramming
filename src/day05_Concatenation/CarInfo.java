package day05_Concatenation;

public class CarInfo {

    public static void main(String[] args) {

        int year = 2005;
        String make = "Opel";
        String model ="Astra Twinport";
        int miles = 120000;
        String color ="Blue";
        int price = 5000;

        String carDisplay = year + " " + make + " " + model
                + ", " + miles + " miles, " +  color + ", $" + price;

        System.out.println(carDisplay);

    }


}
