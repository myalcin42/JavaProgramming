package day40_FinalKeyword;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat(){
        System.out.println(getName() + " is eating dog food");
    }

   // public void drink(){
     //   System.out.println(getName() + " is drinking beer");
   // } bu metot final olduğu için overrride edemeyiz

    //final classlar parent class olamazlar

    public void bark(){
        System.out.println(getName() + " is barking");
    }
}
