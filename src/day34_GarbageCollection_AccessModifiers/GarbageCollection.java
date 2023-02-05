package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;


import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        //all objects that does not have any reference name will be eligible for garbage collection
        //anytime unreferenced object has been detected garbage collector is going to collect that object by calling the finalise method

        //then how can an object be unreferenced?
        //Dog d = new Dog(); mesela burada bir dog objesi oluşturduk ve d variable name atadık bu d bu objenin reference name olur ve garbage collector böyle bir objeyi silemez

        //there are 2 ways in java to make an object unreferenced(eligible for garbage collection)
        //1.by using the null keyword

        String str = null; // null keyword is only for non primitive data types(null means nothing has been created)

        String str1 = "Wooden Spoon"; // bu obje bir str1(reference name) sahiptir ve bu haliyle unreferenced olmadığı için garbage collector tarafından silinemez ama
        str1 = null;

        System.out.println(str1); // null
        //"Wooden Spoon" after line 18 will be eligible for garbage collection

       //Car car1 = new Car("Toyota");
        //car1 = null; otomatik olarak unreferenced car1 objesi garbage collector tarafından silinecek(finalise metodu kullanarak)

        //2.diğer bir yontem by assigning a new reference

        System.out.println("===========================================");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

                  //  new Dog(); // herhangi bir reference name sahip olmadığı için bu satırdan sonra garbage collection için eligible olacak
        //peki ilk dog objesini eligible hale getirmek istersem

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        String language = "Python"; // one reference name only can be referenced to one object
        language = "Java"; // now python is being unreferenced and it will be eligible for garbage collection
        System.out.println(language); // Java

        System.out.println("=====================================");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        ArrayList<Integer> list2 = list1;
        //only one object is created and two reference name
        //yukarıda "one reference name only can be referenced to one object" demiştik ama one object can be referenced to two different reference name durumu olabilir

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1); //[100, 200, 300, 400]
        System.out.println(list2); //[100, 200, 300, 400]
        //because only one object is created and one object is shared by two reference names.two reference names point to the same object. one object may have multiple reference names

        System.out.println(list1 == list2); // true
        //burada unreferenced bir obje olmadığı için garbage collection için bir aday yoktur

        Student student1 = new Student("Tahir", 30,'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1; // one object is created and two reference name is sharing this object
        student2.name = "Ahmet";

        System.out.println(student1); // Student{name='Ahmet', age=30, gender=M, grade=A, id=14}
        System.out.println(student2); // Student{name='Ahmet', age=30, gender=M, grade=A, id=14}

        System.out.println("============================================");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");
        ArrayList<String> l2 = l1;
        l2.add("Python");
       //one object can be referenced by multiple reference names
       //but one reference name can not be referenced to multiple objects

    }
}
