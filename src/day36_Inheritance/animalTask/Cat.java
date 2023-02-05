package day36_Inheritance.animalTask;

public class Cat extends Animal{ // Cat is an Animal(is a relationship kavramı) sadece child classı bişeyler inherit edebilir parent class child classlardan bişey inherit edemez

    public void meow(){
        System.out.println(name + " is meowing");
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }

    //inheritance konsepti sayesinde o kadar kodu tekrar yazmak yerine parent classdan inherit ederiz ve sadece Cat classına özgü metotları oluşturup tamamlarız
}
