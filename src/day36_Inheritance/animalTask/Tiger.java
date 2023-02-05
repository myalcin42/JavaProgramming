package day36_Inheritance.animalTask;

public class Tiger extends Animal{ // tiger is an animal(is relationship kavramı)
    //Animal extends Tiger mümkün değildir çünkü child class kendi parent classının parenti olamaz

    //sonsuz child class oluşturulabilir

    public void hunt(){
        System.out.println(name + " is hunting");
    }

    public void roar(){
        System.out.println(name + " is roaring");
    }
}
