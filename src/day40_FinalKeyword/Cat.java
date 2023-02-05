package day40_FinalKeyword;

public final class Cat extends Animal {//Dog  // dog classı final olduğu için parent class olamaz ama final class child class olabilir
    public Cat(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }
}
