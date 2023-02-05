package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
       // p1.name = "Daniel"; name private olduğu için direkt olarak bu şekilde atama yapamayız
        //p1.age = 28;
        //bu private değerlerine başka bir class içerisinde ulaşamadığımız için getter ve setter kullanırız

        p1.setName("Daniel"); // sadece p1 objesini set eder
        p1.setAge(28);
        p1.setAge(35);
        p1.setAge(-2000); // Invalid age: -2000


       // System.out.println(p1.name + " : " + p1.age); bu şekilde de değere ulaşamayız bu yüzden bu değeri okumak istersek getter kullanırız

        System.out.println(p1.getName() + " : " + p1.getAge());

        //peki getter ve setter aracılığıyla private değere ulaşabiliyorsak private değer oluşturmanın amacı ne?

        //data değerini public yaparsak herhangi bir kısıtlama olmadığı için veriyi kontrol edemezsin ve bu güvenli bir yöntem değildir ve ayrıca getter ve setter bir metot olduğu için instance variable değerlerini belirlemek için koşul oluşturulabilir bu yüzden Person classında  if(age <= 0){
        //            System.err.println("Invalid age: " + age);
        //            System.exit(0);
        //        } set metodu içerisinde böyle bir koşul oluşturduk veriyi kontrol edebilmek ve unlogical değerlerin girilmemesi için
    }
}
