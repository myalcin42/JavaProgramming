package day14_String;

public class StringMethods4 {

    public static void main(String[] args) {

        String str = "Cydeo";

        String str2 = str.repeat(4); //CydeoCydeoCydeoCydeo
        //the string will be concated 4 times in this example

        System.out.println(str);

        String s1 = "Wooden Spoon";
        String s2 = s1.repeat(100);
        //100 kere Wooden Spoon yazar yanyana boşluk bırakmadan. Her Wooden Spoon'dan sonra
        //boşluk bırakmak istersen "Wooden Spoon " şeklinde yazılır
        //100 kere bu ifadenin yazılması konsolda okumak açısından zor olabilir
        //O yüzden Run komutundan sonra Soft-Wrap tuşuna basarsan sol taraftaki yazıyı
        //aşağıya doğru yazar ve okuması kolaylaşır
        System.out.println(s2);

        System.out.println("------------------------------");

        System.out.println("FADY\n" . repeat(15));
        //Bu şekilde de yazılabilir FADY ifadesi 15 kere yazdırılır. repeat bu işe yarar
        //repeat() metodu JDK 11 ve yukarısındaki versiyonlarda çalışır

        System.out.println("--------------------------------");

        String name = "Java";

        //System.out.println(name.repeat(5)); //Arada boşluk olmadan 5 kere Java yazar

        System.out.println((name + " ").repeat(5)); //Arada boşluk olmasını
        //istersek bu şekilde yazılır
    }


}
