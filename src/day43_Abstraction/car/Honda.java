package day43_Abstraction.car;

public final class Honda extends Car{ // Car parent classında abstract metot olduğu için ve Honda classı Car classından inherit yaptığı için (inherit yapınca ana class olduğu gibi alınır)abstract metotta inherit edilmiş oldu ama bir classın abstract metodu içerebilmesi için abstract class ya da interface olması lazım.Honda classını abstract yapabiliriz ve bu compiler error ortadan kalkar ama abstract classda herhangi bir metot oluşturulamaz.Bu yüzden ana classda oluşturduğumuz abstract metodun override edilmesi zorunludur.Car classında bulunan stop metodunu da override yapınca compiler yine hata verdi çünkü abstract bir metot parent class tarafından child classa verilmiş yarım kalan bir görev gibidir ve tamamlanması yani overrride edilmesi gerekir.hatanın üstüne gelip ampüle tıkladığımızda implement methods seçeneğini seçersen overrride edilmesi gereken metodu otomatik oluşturur(Abstraction: focusing on the essentials without worrying about the small details(implementations) of the method

    public Honda(String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    public void stop() {
        System.out.println("");
    }

    public void start(){
        System.out.println("Twist the key to ignition");
    }




}
