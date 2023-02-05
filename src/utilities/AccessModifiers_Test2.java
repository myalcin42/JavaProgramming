package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData); // public is always accessible
       // System.out.println(AccessModifiers.defaultData); in different packages default is not accessible, default is not visible outside the package
        // System.out.println(AccessModifiers.privateData); private only reachable within the same class, private is not visible outside the class

        AccessModifiers.method1(); // public her yerde erişilebilir
       // AccessModifiers.method2();  default sadece aynı paket içerisinde erişilebilir
        // AccessModifiers.method3(); private sadece aynı class içerisinde erişilebilir
    }
}
