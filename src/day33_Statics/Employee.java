package day33_Statics;

public class Employee {

    public String name; // herhangi bir variable oluştururken onun instance mı static mi olacağını belirlemek için şu soru sorulur: bu variable bütün objeler için değişir mi yani her obje için ayrı birer kopyaya ihtiyaç var mı? eğer varsa instance olarak oluşturulur çünkü static oluşturduğunda bütün objeler için tek bir data değeri depolanır yani tek bir tane kopya oluşur.Yani bütün objeler aynı data değerine sahip olur.

    public double salary;

    public static boolean isHuman = true; // bu variable bütün objeler için geçerlidir bu yüzden static olarak oluşturulur

}
