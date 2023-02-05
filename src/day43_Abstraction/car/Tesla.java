package day43_Abstraction.car;

public final class Tesla extends Car {

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    public void start() {
        System.out.println("Say \"start\" ");
    }

    public void autoPilot(){  // bu metot final bir classın içerisinde olduğu için final metot olmasa bile override edilmesi mümkün değildir çünkü overrride işlemi bir subclassda olur ve final bir class extend edilemez yani parent class olamaz
        System.out.println(getBrand() + " " + getModel() + " has auto pilot feature");
    }
}
