package day44_Abstraction.animalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable{ //multiple inheritance between classes is not allowed in java but mulitple inheritance from an interface or between interfaces are possible burada Eagle classı iki interfaceden inherit edebilir

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating snake");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts snake");
    }


    @Override
    public void fly() {
        System.out.println(getName() + " can fly 50km/h");
    }
}
