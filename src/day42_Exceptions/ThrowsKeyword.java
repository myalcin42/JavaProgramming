package day42_Exceptions;

public class ThrowsKeyword { //used only for checked exceptions

    public static void main(String[] args) throws InterruptedException{ //başka bir exception olursa onu da yanına ekleyebilirsin ama throws keyword ile yapılan handling geçici bir çözümdür try&catch gibi kalıcı değildir.Çünkü throws keywprd olan bir metot başka bir metot içerisinde çağırıldığınsda o metotta bu excepiton handle edilmek zorundadır yani throws keyword en iyi çözüm değildir sadece daha clean yani az bir kod bloğuna sahip olmamızı sağlar.eğer bu metot başka bir metot tarafından kullanılmayacaksa throws iyi bir çözümdür

        System.out.println("---------------Test 1----------------------------");

        System.out.println("Hello");
        Thread.sleep(3000); // bu bir checked exception olduğu için hemen handl edilmesi gerekir eidlmezse kod çalıştırılamaz.bu yüzden her seferinde try catch bloğu kullanmaktansa(lots of code) throws keyword kullanılabilir(sadece checked exceptions için kullanılır ama try catch daha iyi bir yöntem dedi Muhtar) throws keyword exception kodunun içinde bulunan metotun signature kısmından sonra eklenir
        System.out.println("Cydeo");

        System.out.println("-------------Test 1 completed--------------------");

        System.out.println("--------------test 2-------------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("-------------Test 2 completed-------------------");

    }
}
