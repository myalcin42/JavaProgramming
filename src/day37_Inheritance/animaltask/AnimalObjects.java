package day37_Inheritance.animaltask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M', 1, "Small", "white");

        System.out.println(dog1); // Animal{name='Alex', breed='Husky', gender=M, age=1, size='Small', color='white'}

        dog1.bark();
     //   dog1.scratch(); dog classına ait olmadığı için bu şekilde hata verir

        Cat cat1 = new Cat("Love", "Siamese", 'F', 2, "Large", "brown");

        System.out.println(cat1); // Animal{name='Love', breed='Siamese', gender=F, age=2, size='Large', color='brown'}
        //burada toString metodunu Animal parent classından inherit ettiğimiz için Animal objesi gibi görünüyor bunu her child class için ayrı şeilde yazdırmak istersek overriding yapmamız gerekir

        cat1.scratch();
      //  cat1.bark(); dog classına ait olduğu için bu şekilde metoda ulaşılmaz

        Parrot parrot1 = new Parrot("King", "Macaw", 'M', 3, "Small", "Blue");

        System.out.println(parrot1); // Animal{name='King', breed='Macaw', gender=M, age=3, size='Small', color='Blue'}

    }
}
