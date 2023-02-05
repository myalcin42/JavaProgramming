package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200; //Bu data primitive bir data tipinde atandığı için bu haliyle Collection ve Map data structurelarda kullanılamaz sadece Arrayde kullanılır.Bu yüzden bu primitive data tipini objecte çevirmek gerekir.

        //convert the primitive type to an object(Autoboxing olarak adlandırılır)
        Integer n1 = num1; //Autoboxing
        //Long n1 = num1; compiler burada hata verir casting konusunda ki gibi int primitive data tipini long a atayamayız.Bu object olduğu için sadece kendi data tipini kabul eder

        int num2 = n1; //Unboxing olarak adlandırılır

        System.out.println("==========================================");

        Integer integerValue = 100;

        long longValue = integerValue; //Unboxing yaparken bu şekilde daha büyük bir primitive bir data tipine atama yapabilirsin(casting de olduğu gibi)

        Byte b1 = 25;
        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        int num3 = 200;
        // Long l2 = num3; Autoboxing yaparken yani primitive data tipini wrapper class atarken data tipi neyse aynı wrapper class seçmek zorundasın
        Integer num4 = num3; //Autoboxing

        System.out.println("===================================");

        Integer z = 900; //Burada primitive integerla ilgili bir değişim olmadığı için bu işlem autoboxing ya da unboxing değildir.
        Integer y = z;

        System.out.println("==============================");
        int[] numbers1 = {1,2,3,4,5}; //Görüldüğü üzere Array primitive ve non primitive data tipini desteklediği için bu şekilde kullanabiliriz ama Collection ve Map data structure larda sadece wrapper class kullanılır
        Integer[] numbers2 = {1,2,3,4,5};

        //Wrapper classes birer class oldukları için bazı kullanışlı metotlar vardır
        //parse method : converts String to primitive




    }

}
