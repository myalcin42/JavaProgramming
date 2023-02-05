package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();//object oluşturma.Mesela String objesi oluştursan String data tipini atarsın.Burada Dog objesi Dog classında olacağı için bu şekilde yazılır
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog(); // each object has separate copies of instance Attributes
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepherd", 2, 'M', "Large", "Black");

        System.out.println(dog1); // bu şekilde yazdırırsan hash kodu oluşur day30_CustomClass.Dog@7a79be86 bu yüzden yazdırabilmek için toString metodunu Dog custom class içerisinde oluşturmak gerekir
        //toString metodu oluşturduktan sonra
        //Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}
        System.out.println(dog2);
        //Dog{name='ACE', breed='Husky', age=5, gender=M, size='Large', color='White & Black'}

        System.out.println(dog3);
        //Dog{name='Jack', breed='German Shepherd', age=2, gender=M, size='Large', color='Black'}

        dog1.eat();  // Lucy is eating (BİRİNCİ KÖPEK)

        dog2.bark(); // ACE is barking (ikinci köpek: instance metot olduğu için her köpek objesi için ayrı bir kopya oluşturur

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-bull", 6, 'M', "Large", "Black");

        System.out.println("==============================================");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));

        femaleDogs.removeIf(p -> ! (p.gender == 'F'));
        System.out.println(femaleDogs);
        maleDogs.removeIf(p -> ! (p.gender == 'M'));
        System.out.println(maleDogs);




    }


}
