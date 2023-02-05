package day39_Recap.cydeoTask;

import static day39_Recap.cydeoTask.Tester.*;
public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz", 29, 'M', 1, "Java Developer", 125000);

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);

        Teacher teacher = new Teacher("Daniel", 32 , 'M', 3, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30,'M', 8, "SDET");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("================================================");

        developer.setAge(39);

        System.out.println(developer.getAge()); //39

        System.out.println("======================================");

        developer.work(); // aynı metot üç farklı implementation(method overriding - there is only one method in the memory)
        tester.work();
        teacher.work();
//        student.work(); // student employee classından inherit almadığı için bu metodu kullanamaz

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();

        System.out.println("==============================================");

        tester.eat();
        tester.drink();
        tester.sleep();

        //tester.fixingBugs(); hata verir çünkü bu metot developer classına aittir

        tester.createTicket();



        System.out.println("==============================================");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

       // teacher.fixingBugs();

        System.out.println("===========================================");

        student.eat();
        student.drink();
        student.sleep();

        student.study();





    }
}
