package day36_Inheritance.encapsulation;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Daniel", 2,'E', 'Z', "MIT" );

        student1.setAge(39);
        System.out.println(student1); // Student{name='Daniel', age=39, gender= , grade= , schoolName='MIT'}
        //setters give the ability to set a specific field without changing the others



    }
}
