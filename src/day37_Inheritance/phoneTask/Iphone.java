package day37_Inheritance.phoneTask;

public class Iphone extends Phone{


    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color); //bu şekilde super keyword içerisinde o classın bütün objelerinde ortak bir özellik varsa girilebilir burada ıphone telefonlarının markası Apple olduğu için bu şekilde belirttik
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " " + " is having a face time: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " " + model + " " + " is having a face time: " + email);

    }




}
