package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "White");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
       // dog.hunt(); hunt tiger classına ait bir metot olduğu için kullanamayız ama Animal classından inherit edilen herbir variable ve metot şu an Dog classına ait olduğu için onları ve sadece Dog classına özgü oluşturduğumuz metotları da kullanabiliriz
        // dog.scratch(); scratch is the method of the cat class and you can not use the method from a dog object there is no relationship between cat and dog class
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3, "Small", "brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
      //  cat.bark(); bark metodu dog classına aittir we can not call it through the cat object
        cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();
       // tiger.scratch(); scratch metodu cat classına aittir ve we can not call it through the tiger object
        System.out.println(tiger);


    }
}
