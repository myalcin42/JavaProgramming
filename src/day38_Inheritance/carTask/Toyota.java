package day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + " " + model + " is reliable");
    }

    /*
    public void start(){
        System.out.println(brand + " " + model + " is starting");
    }
     */
    //parent class da oluşturduğumuz start metodu bütün child classlarda aynı şekilde sonuç verir ama arabaların çalıştırılması için farklı işlemler gerekebilir ve bu metodun her bir child class için modifiye edilmesi gerekir biz buns method overrriding diyoruz aynı metodun farklı uygulaması kısaca.method overloading den farkı tek bir metot sadece içeriği değişik yani bütün subclasslarda metodu değiştirsen bile hafızada tek bir metot depolanır.Method overriding sadece subclass da yapılır.instance metot olması gerekir ve private ya da final olmaması gerekir metodun access modifierı ne ise override yaparken ya aynısı ya da derece olarak daha görülebilir bir access modifier belirlenmek zorundadır

    public void start(){ // start metodu ana classda public olduğu için overrride yaparken ya public ya da daha fazlası gerektiği için bu da public olur. private metot override edilemez.mesela ana metot default olursa override edilen metot da ya default ya protected ya da public olabilir

        System.out.println("Twist the key to ignition to start " + brand + " " + model);

    } //şu an iki farklı metot varmış gibi gözükse de sadece bir tek metot vardır(in the heap memory) ve hangisinin execute edileceği objeye bağlıdır toyota objesinden çağrılırsa bu versiyonu execute edilir

    //if different implementation is necessary you should override the method


}
