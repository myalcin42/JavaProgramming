package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { // Can the class be static? yes but the class can be static only if the inner class has static keyword outer class can not be static bu static classı kullanmayacağız ama interview de sorulabiliyormuş o yüzden bilmemiz gerekir
    //classes they dont have any memory  unless any code is written inside of it

    static class class1{ // javada bu şekilde nested class oluşturulabilir(class içerisinde başka bir class ve bir classda sadece bir tane public(access modifier) class olacağı için bu class da default access modifier alır.sadece inner class static class olabilir

    }

    public static int num = 100; // static variable

    public static void method(){ // static method

    }

    static{ // static block

    }


}

class A{ // javada bir classın static olabilmesi için nested class oluşturmak mecburidir(outer class) outer class can not be static.Neden outer class static olamaz?Çünkü static argümanı bir classa dayanmak zorundadır burrada class A başka bir classa bağlı değildir ama inner olarak oluşturduğumuz B classı A ya bağlı olduğu için static class olabilir

    static class B{ // inner class (class B is the member of an another class that is why it can be a static class)
        public static void method1(){

        }
    }
}


class C{
    public static void main(String[] args) {
        A.B.method1(); // eğer inner classı çağırmak istersek bu inner class static olduğu için yani başka bir classa ait olduğu için o class aracılığıyla çağırılır
    }
}