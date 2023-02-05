package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData); // public is always reachable, accessible
        System.out.println(AccessModifiers.defaultData);// default is reachable within the same package
       // System.out.println(AccessModifiers.privateData); // private is only accessible within the same class it is not reachable within the same package but within the different classes(only accessible within the same class)

        AccessModifiers.method1(); // public olduğu için her zaman erişilebilir
        AccessModifiers.method2();// aynı pakette olduğu için default access modifier da erişilebilir
      //  AccessModifiers.method3(); private olduğu için class dışında erişilebilir değil
    }
}
