package day37_Inheritance.animaltask;

public class Dog extends Animal{
    //Animal parent classında oluşturduğumuz constructorı inherit etmek mümkün değildir.Çünkü constructor class ismi ile aynı olmak zorunda ve dog classında animal isimli constructor oluşturamayız

   // public Dog(){} // constructors can not be inherited but if constructor is visible child class must call it
        //constructor bir class için must have bir elementdir yani olmazsa olmazdır manual olarak oluşturmasan bile compiler default olarak constructor oluşturur parent clas içerisinde default constructor varsa yani manuel olarak constructor oluşturulmamışsa chşld class onu implicitly bir şekilde çağırır ama parent classda constructor varsa child class onu super keywordu kullanarak çağırmak zorundadır çağırmazsa compile error alır

    public Dog(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color); // eğer parent classda bir constructor manual olarak oluşturulmuşsa bu constructor explicitly bir şekilde super() keyword ile çağrılmak zorundadır
        //eğer child classda public int a; diye bir varible varsa constructor içerisine sonuna ekleriz ve this ketwordu ile assign ederiz
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

}
