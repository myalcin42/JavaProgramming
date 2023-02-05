package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable{ //interfaceden inherit işlemi implements keywordu ile yapılır ama compiler hata verir çünkü Dog classı abstract bir class değil ama Playable interfaceinde play isminde abstract bir metot var bu yüzden overrride edilmek zorundadır

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats pizza" );
    }

    public void play(){
        System.out.println(getName() + " is playing with ball");
    }
}
