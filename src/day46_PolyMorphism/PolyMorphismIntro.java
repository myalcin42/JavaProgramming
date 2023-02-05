package day46_PolyMorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.*;

import java.util.ArrayList;

public class PolyMorphismIntro {

    public static void main(String[] args) {

        String str = "wooden spoon";

        Integer n1 = 2;
        Double n2 = 5.5;

        Boolean r1 = true;

       // String[] array = {str, n1, n2, r1}; bu variablelar hepsi farklı bir classa ait olduğu için bu şekilde bir arada olamazlar çünkü String, Integer, Double gibi classlar arasında inheritance IS A relation olmadığı için bu şekilde olmaz ama bütün classların ortak parent classı Object classı olduğu için Object classına ait bir arrayde toplanabilir

        Object[] array = {str, n1, n2, r1, new Circle(4), new Square(7)};

        Employee tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Employee developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Employee teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Employee driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00); //polymorphism kısaca parent classın subclass objelerine reference olmasıdır yani önkoşul inheritance olmasıdır seleniumdaki driver objesi gibi WebDriver interfaceinden chorme, firefox gibi farklı browserlara driver objesi üzerinden ulaşılabilmesidir

        ArrayList<Person> cydeoEmployees = new ArrayList();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(developer);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);


        System.out.println("-------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        employee.work();  //polymorphism de eğer bir metot çağrılırsa her zaman override edilen metot çıktısı laınır ama eğer metot override edilmemişse parent classdaki metot execute edilir
        // employee.bugReport(); mesela bu metot tester classına özgün bir metot olduğu için yani Employee classında olmadığı için hata verir çünkü polymorphism de reference classda hangi metotlar varsa sadece onlar çağrılabilir

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White"); //polymorphismde hangi ögelerin çağrılacağına reference type karar verir burada Animal reference type(data type) olduğu için sadece Animal classı içerisinde bulunan metot ve variablelar çağrılabilir
        animal.drink();
        animal.eat();
        // animal.play(); // play metodu sadece dog classına ait olduğu için hata verir
        //  animal.bark();
        //mesela burada Animal classı yerine Dog yazarsak bark() metodu hata vermez ama animal variable name yani reference name Dog classı dışında mesela Tiger classına ait objelere point edemez bu yüzden "if you want one variable to be able to reference different objects you should apply polymorphism

        //yani Animal animal1 = new Dog() burada sol taraf reference type sağ taraf ise object type'dır. burada neye ulaşılacağına reference type karar verir ama hangi miplementation olacvağına object type karar verir eğer metot overrridden edilmişse bu hali edilmemişse ana class daki metot bloğu execute edilir

        Shape shape = new Circle(5);
        shape.area(); //shape varibale name'in hangi classa ait bir obje olduğunu anlamak için instanceof keywordu kullanılır mesela burada Circle classına ait olduğu için başka bir class ismi girildiğinde false Circle girildiğinde true olur.syntax aşağıda ki gibidir

        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isSquare = " + isSquare); //false
        System.out.println("isTriangle = " + isTriangle); //false
        System.out.println("isRectangle = " + isRectangle);//false
        System.out.println("isCircle = " + isCircle); // true








    }
}
