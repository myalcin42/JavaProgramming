package day45_Abstraction;

public interface PropertiesOfInterface { // encapsulation interfacede uygulanamaz çünkü interfacede private access modifier değil public default olarak atanır

    int a = 100; //instance bir variable değil interfacede instance variable olmaz default olarak static ve final
    static int b = 200; // default olarak final

//    public PropertiesOfInterface(int a){ constructor interface de olmaz çünkü interface bir class olmadığı için objede oluşturulamaz
//        this.a = a;
//    }

//    static{ static blok interfacede olmaz
//        b = 100;
//    }

//    public void method1(){
//        System.out.println("ınstance method");
//    } instance metodu kullanmak için object oluşturmak gerekir interface dew obje oluşturulmadığı için instance metot da interfacede olmaz

    public static void method2(){
        System.out.println("static method"); //static method is allowed
    }

    public abstract void method3(); //abstract method is allowed

    public default void drink(){ //interfacede instance metot olmaz ama bu şekilde default method oluşturulabilir java 8 den önce sadece abstract metot oluşturuluyordu interfacede ama şimdi eğer farklı implementation olmayacaksa subclasslar için default metot da kullanılabilir class da böyle bişey olmaz
        System.out.println("default method"); //no need to override
    }
}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {
        new Test().drink(); //interfacede oluşan drink metodu default olduğu için ve inherit edilen class regular class olduğu için ve default(not access modifier,specifier) metota sahip olmadığı için instance metot oldu
    }
}
