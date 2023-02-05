package day37_Inheritance.animaltask;

public class Cat extends Animal {

    //parent classda constructor olduğu için child class bunu çağırmak zorundadır bu haliyle hata verir bu durum zorunlu olduğu için intellij bir kısayol seçeneği sunar hata verdiğinde ampule ya da sağa tıkla show context actions ve ilk seçeneği tıkla(create constructor super keyword) ( ya da hata veren ifadenin sonunda Alt + Enter)
    public Cat(String name, String breed, char gender, int age, String size, String color) { //only a constructor can call another constructor
        super(name, breed, gender, age, size, color); // constructor must be at the first step yani ikinci satırda olursa hata verir
        //super() keyword is used to call parent class constructor from child class
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }

    //you can not extend more than one class to a class yani mesela A classı sadece bir parent classdan inherit yapabilir

    //one class only extends one class
    //one class can not be extended by multiple classes
}
