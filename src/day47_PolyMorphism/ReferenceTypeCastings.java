package day47_PolyMorphism;


import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Cube;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Shape shape = (Shape) new Circle(4); //casting(converting) from subtype to the super type(upcasting) made implicitly(primitive casting gibi (Shape) yazmana gerek yok) reference type casting olması için inheritance olnası lazım

        //WebDriver driver = (WebDriver) new ChromeDriver();

        //Downcasting: casting the larger reference type( parent class or interface) to smaller reference type(sub type)done explicitly

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White"); //burada bir upcasting var Animal animal = (Animal) new Dog... aynı zamanda polymorphism var yani parent being referenced to the child object

        //peki downcasting niye yapıyoruz
       // animal.bark(); bu objeden Dog classında bulunan bark() metoduna ulaşamayız çünkü object type Animal olduğu için neyin çağrılacağına o karar verir ve bark() metodu Animal classında olmadığı için çağrılamaz ama bu varaible sublcass reference type a atarsak sorun çözülür bu yüzden downcasting yaparız(aynı objeyi kullanmaya devam etmek istiyoruz bu işlemde)

        Dog dog = (Dog)animal; //burada sağdaki objenin reference type'ı Animal yani dog variable bulunan Dog classından büyük o yüzden downcasting yapılır burada halen geçerli bir obje var ve farklı iki refeerence name o objeye point ediyor

        System.out.println(animal.getName()); // Max (sadece bir obje iki farklı reference name
        System.out.println(dog.getName()); //Max

        //animal.bark();
        dog.bark();

        ( (Dog)animal ).bark(); //yukarıda dog isminde bir variable daha oluşturduk aynı obje için ama variable oluşturmaktaki amaç tekrar kullanmaktır eğer tekrar kullanılmayacaksa bu şekilde de ifade edilebilir yani animal variabledan downcasting yaparak metot çağrılabilir

        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());  // shape1.getSide() dersen compile error hatası alırsın çünkü side Square classına ait bir variabledır ve Shape reference type da olmadığı için çağrılamaz ama bu şekilde downcasting yaparsan yani reference type olan Shape i Square type'a cast(convert) yaparsan sorun çözülür bunun için intellij kısayol olarak compile hatası aldığında ampuldeki seçeneklere tıklarsan kısayol oalrak yapabilirsin

        System.out.println("========================================");

        Animal animal2 = new Cat("Jim", "Scottish", 'M', 3, "Small", "White");

//        Cat cat = (Cat) animal2;
//        cat.meow();

        ((Cat) animal2).meow();

        ( (Dog) animal2).bark(); //mesela bu şekilde yazdığımzda animal2 object type Cat ve biz bunu Dog a cast etmeye çalışıyoruz ama aralarında IS A relation yok bu yüzden kod çalışınca ClassCastException exception alırız

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);

        ((Tester)employee).bugReport();

      //  ((Tester)employee).unitTest(); bu şekilde hata verir çünkü unittest() metodu Developer classına aittir. ama burada tester classı reference type olduğu için neyin çağrılacağına reference type karar verir bu yüzden metot çağrılamaz

        ( (Developer)employee).unitTest(); // burada obje tipi Tester ama Developer a casting yaparsak ClassCastException olur çünkü aralarında IS A relation yoktur

        Driver driver = (Driver) employee; //employee reference name Tester reference tipine ait olduğu için Driver classına cast edilemez çünkü aralarında IS A relation yoktur (ClassCastException alırsın)
        Person person = (Person) employee; //upcasting(Tester can be a Person)
        Teacher teacher = (Teacher) employee; //(ClassCastException alırsın)

        System.out.println("========================================");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
        ((Cube)s1).volume();  //volume metodu Circle classında yok burada downcasting yaptığımız s1 variable için yeni reference name(burada Cube) eskisiyle IS A relationship olması gerekir (ClassCastException)











    }
}
