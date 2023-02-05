package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        //parse metodu
        String str = "123"; //burada bütün karakterler digit yani bu ifadeyi bir integera çevirebiliriz

        int num = Integer.parseInt(str); // return type is int. Integer.parseInt(str) bu ifade primitive bir değer verir bu ifadeyi başka bir primitive atadığımız için burada Autoboxing ya da Unboxing işlemi yoktur

        System.out.println(num + 1); //124
        System.out.println(str + 1); //1231

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); // returns primitive double

        System.out.println(num2 + 1); //11.5

        //MAX_VALUE  ve MIN_VALUE variable (metot değildir)

        int max = Integer.MAX_VALUE; //maksimum integeri verir
        int min = Integer.MIN_VALUE; //minimum integeri verir

        System.out.println("max = " + max); // 2147483647
        System.out.println("min = " + min); // -2147483648

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2); // 9223372036854775807
        System.out.println("min2 = " + min2); // -9223372036854775808

        String s1 = "true"; // true dışında ne yazarsa yazsın false olarak çıktı verir

        boolean r1= Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("==============================");

        //valueOf metodu

        String s2 = "123";

        Integer x = Integer.valueOf(s2); //valuOf metodunun parse metodundan tek farkı valueOf metodunda wrapper class değeri return edilir

        int y = Integer.valueOf(s2);

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3);

        System.out.println(z);

        System.out.println("=====================================");

        //isDigit() metodu

        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1);

        System.out.println(r2); // true çünkü 0 bir rakamdır yani digit ama 'A' olsaydı mesela false olurdu

        //isLetter() metodu

        boolean r3 = Character.isLetter(ch1); //false olur çünkü letter değildir

        //özel karakter varsa true olur
        boolean r4 = ! Character.isLetterOrDigit(ch1); //

        //upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("===================================");

        //find sum of all digits
        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if(Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }
        }

        System.out.println(sum);


    }

}
