package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100; // access modifier : public
    static int defaultData = 200; // access modifier : default
    private static int privateData = 300; // access modifier: private

    //public is always reachable
    //all of the access modifiers are reachable within the class
    //default is accessible within the package

    public static void method1(){
        System.out.println("Public");
    }

    static void method2(){
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }
}
