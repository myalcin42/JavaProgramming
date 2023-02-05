package day34_GarbageCollection_AccessModifiers;
// eğer circle classı içerisinde bulunan pi sayısı static variable import etmek istersem

import static day34_GarbageCollection_AccessModifiers.Circle.pi;
//import static day34_GarbageCollection_AccessModifiers.Circle.*; bu şekilde yazılırsa da bütün static memberlar import edilir

public class StaticImport {

    public static void main(String[] args) {
        //normalde import işlemini import packageName.className; formatında yaparız ve bu bütün herşeyi import eder ama sadece static olanları(memeberları) import etmek istersek
        // import static packageName.className.staticMember; şeklinde yazarız bu ifade sadece spesifik bir static memberı import eder
        //import static packageName.className.*; bu şekilde yazılırsa ise bütün static memberlar import edilir

        System.out.println(Circle.pi);// bu şekilde çağırabiliriz pi değerini ama yukarıda import ettiğimiz için buna gerek yok direkt olarak kullanabiliriz
        System.out.println(pi); // yani bu şekilde direkt çağırabiliriz

    }
}
