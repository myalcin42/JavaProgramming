package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Daniel", 'M', 32); // Person custom  classında bir constructor oluşturduk ve parametreler belirledik bu yüzden artık burada parametre girmek zorundayız eğer constructor oluşturmasaydık default constructor compiler tarafından otomatik olarak oluşturulacaktı

        System.out.println(person1); //Person{name='Daniel', gender=M, age=32}

        Person person2 = new Person("Kseniia", 'F', 28);
        person2.age = 30; // bu şekilde değişiklik yapılabilir

        System.out.println(person2); //Person{name='Kseniia', gender=F, age=28}

    }
}
