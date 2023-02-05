package day23_CustomMethods_Void;

public class CustomMethodsIntro {

    //static public void main(String[] args) { // static public sırası bu şekilde de olabilir ama önerilen yöntem public static dir

    public static void greeting(){

        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");
        //bu print ifadelerini tekrar kullanılabilir hale getirmenin yolu metod kullanmaktır.Metod kendi kendine execute edilmez.oluşturulan custom metodunu çağırman gerekir.Her oluşturduğun custom metod bağımsızdır yani başka bir metodun içerisine yerleştirilemez
    }

    public static void main(String[] args) { //bu main metodunu yukarıda oluşturduğumuz custom metodundan önce ya da sonra yazmamızın farkı yoktur.Çünkü java compiler top to bottom kuralı sadece metotlar içerisinde geçerlidir.Bu haliyle konsolda hiçbir ifade gösterilmez yukarıda ki print ifadelerine rağmen.Çünkü main metot içerisinde herhangi bir ifade yoktur.

        System.out.println("Test Started");

        greeting(); // metot bu şekilde çağrılır ve metot bloğunun içerisinde bulunan ifadeler execute edilir

        greeting(); //2.defa çağırırsan tekrar execute edilir

        System.out.println("Test completed");

    }


}
