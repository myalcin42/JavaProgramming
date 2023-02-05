package day10_NestedIf;

public class TernariesIntro {
    //ternaries kısaca if statements için kısayol anlamına gelir
    public static void main(String[] args) {
        int n = 100;

        if (n % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }//Bu koşul ifadesinde çıktı içerisindeki iki ifade de aynı data tipine aittir(String)
        //Böyle durumlarda kısayol olarak ternaries kullanılabilir

        System.out.println("-----------------------------------------");

        String result1 = (n % 2 == 0)? "Even Number" : "Odd Number";
        //               koşul + ?(if) + sonuç  :(else) sonuç
        //Bu ifade yukarıdaki if ifadesinin aynısıdır.Sadece ternary kullanılmıştır

        System.out.println(result1);


        System.out.println("----------------------------------------");
        //Alkol alabilme görevi
        int age = 23;
        if(age >= 21){
            System.out.println("Eligible"); //String
        }else{
            System.out.println("Not Eligible"); //String (ikisi de aynı data tipi ternary
            //kullanılabilir
        }

        //System.out.println( (age >= 21)? "Eligible" : "Not Eligible" );//direk böyle
        //yazılabilir fakat tercih edilen yöntem bu ifadeyi bir data tipine atamak olacaktır
        //Burada iki sonuçta aynı data tipi(String) olduğu için Stringe atadık
        String result2 = (age >= 21)? "Eligible" : "Not Eligible";
        System.out.println(result2);

        System.out.println("-------------------------------------------------");
        int number = 100;

        if(number > 0){ //Her blokta tek bir data tipi değeri var bu yüzden
            // ternary uygulanabilir
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative"); //Bu ifade int olsaydı ternary kullanılamazdı
        }else {
            System.out.println("Zero");
        }

        String result3 = (number > 0) ? "Positive" :(number < 0)? "Negative" : "Zero";
        //ternary de if ifadesi ? işareti olarak verilir koşul ? işaretinden önce gelir
        //daha sonra data değeri yazılır.Else if için :? işareti kullanılır daha sonra
        //yine koşul ifadesi aynı şekilde ? işaretinden önce olacak şekilde yazılır
        // :( bu somurtma işaretini görürsen else if bloğu vardır
        //daha sonra else ifadesi için : işareti kullanılır ve yanına data değeri yazılır
        //son olarak bu ifade bir variable olarak atanır

        System.out.println(result3);
    }



}
