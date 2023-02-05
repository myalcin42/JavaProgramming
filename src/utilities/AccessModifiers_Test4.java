package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        System.out.println(AccessModifiers_Test4.name2);
        //outside the package if there is a subclass protected is always visible to that subclass

        AccessModifiers_Test4.method2();
        //protected metot, paket dışında sadece subclass içerisinde çağrılabilir

    }
}
