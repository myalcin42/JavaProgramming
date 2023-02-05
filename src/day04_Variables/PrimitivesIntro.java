package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        /*
        age:38 years old(Bu ifadeyi defalarca kullanmak istersek
        her defasında 38 datasını hatırlamamak için bu ifadeye
        bir Variables atanır
        Variables atamak için formül Datatype Variables Name=Data
        Aşağıdaki ifade bu formüle göre oluşturuldu
        */
        byte age = 38;

        //weight:160 pounds
       // byte weight = 160;//bu ifadeye byte atayamayız.Çünkü 160 byte sınırları içerisinde değil
                            // çünkü byte -128 ile 127 arasında bir rakam olması gerekir

        // short y = 160; if you assign "y" as a variable name for weight it will cause problem
        short weight = 160; //160 is within the range of short data type
        // byte ve short u aynı anda kapsayan rakam olursa byte olarak oluştur
        //çünkü byte hafızada 1 byte yer kaplar short 2 byte olarak yer kaplar

        //salary:100000 $
        //short salary = 100000; //100000 number is out of the range of short data type

        //int salary = 100000;//int is the data type preferred for the integer numbers
                            //byte ve shorttan ziyade hep int kullanacağız
                            //büyük rakamlarda ondalık kısmını belirtmek için normalde
                            //100,000,000 , kullanırız java bunu integer olarak kabul etmez
        int salary = 100_000;                    // onun yerine 100_000_000 kabul eder

       // int asset = 3_333_333_333;//the number is not within the range of int
        //Bu örnekte int yerine long yazarsan compiler hatası almaya devam edersin
        //Çünkü java rakamlarda by default olarak int kullanır

        //long asset = 3_333_333_333 bu şekilde yazarsan compiler yine hata verir
        //Çünkü bu rakamı default olarak int kabul eder.Bu rakamın long olarak atanması
        //için rakamın sonuna ya büyük harf L ya da küçük l eklemek gerekir

        long asset = 3_333_333_333L;//long sadece rakam int aralığı dışındaysa kullanılır
                                    //Başka bir senaryo yoktur long data type ın kullanıldığı

        // ya da long asset = 3_333_333_333l; yazmak gerekir

        //Muhtar Hocanın uyarısı integer data değeri kullanıldığında hep int kullanın

        //for decimal numbers there are two data types : float ve double
        //java default olarak double kabul eder

        //tax: 0.26

        float tax = 0.26F; // aynı long integer data type da olduğu gibi java default olarak
                          // decimal ondalık rakamlarda default olarak double kabul eder
                            //bu yüzden float data type kullanılırsa rakamın sonuna F ya da f

        // Muhtar Hoca's warning : From now on with decimal numbers use "double"

        // # char is designed for single character
        char ch1 = '#';//tek karakter olacaksa '' işareti içerisinde olacak
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;//from ASCII table # işaretinin karşılığı tabloda 35 olarak geçiyor
        System.out.println("ch2 = " + ch2);
        //char data type için rakam atasan bile çıktı karakter olacaktır
        // char sadece tek bir karakter datayı bir variable atamak istediğimizde kullanılır
        //Mesela gender male ya da female yani M ya da F gibi

        char gender = 'F'; //tek bir karakter örnekte görüldüğü gibi, fazlası olmaz

        char grade = 'A';

        char yesNo = 'Y';



        //Every single character is represented by a number in Java
        //Computers can only understand numbers

        //Kan gurubu iki karakter olabileceği için (AB+ mesela) char data type olmaz
        //Char data type sadece tek bir karakter için kullanılır

        boolean isEmployed = true;
        boolean isMarried = false;//boolean data tipi sadece true ve false kabul eder

        boolean result = 100 > 300;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);
        
        //Birden fazla karakter olursa String data type olur ve "" işareti içerisine yazılır
        //String için karakter limiti yoktur
        String name = "Wooden Spoon";
        String city = "McLean";
        String country = "USA";
        System.out.println("name = " + name);


        /*
        Variable name rules
        1.They should start with lower case
        2. Only characters that are allowed to use are _ and $
        3.Digits are allowed to use within the variable name
        but you can not start with a number with a variable name
        4.variable names should not be the names that Java reserved
        5.variable names should be readable and understandable
        6.variable name can not include space
        7.one variable name only be given to one variable, they are unique
        8.camelCase

        Within the same Class you can not use the same variable name more than once
         */






    }



}
