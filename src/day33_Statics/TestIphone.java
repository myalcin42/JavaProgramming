package day33_Statics;

public class TestIphone {

    public static void main(String[] args) {

        System.out.println(Iphone.OS); // bu şekilde static variable direkt olarak çağrılabilir ama instance variable kullanılabilmesi için bir objeye ihtiyaç vardır static classa dayanır instance objeye

        //eğer bir static metot varsa class ismi kullanılarak o metot çağrılabilir ama instance metotlar objeye ihtiyaç duyarlar

        // static metotlarda sadece static member kullanılabilir

        //instance belongs to the object if you want to use them you should create an object

        //static methods can be accessible through the class name

        //static methods only accept static members

        //Should a method be static? bu soruyu şu soruyu sorarak araştır
        //Does it use any fields (instance variables) or instance methods?
        //eğer yes ise instance method no ise static metot oluşturabilirsin



    }
}
