package day37_Inheritance.phoneTask;

public class Phone { // parent class only contains the common features of all the subclasses

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    static{
        hasBattery = true;
    }

    public void call(long phoneNumber){
        System.out.println(brand +" " + model +  " is calling" + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + " " + model + " is texting" + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }

    //eğer classlar arasında ki ilişkiyi görmek istersek soldaki klasör kısmından classları işaretleriz ve sağa tıklarız Diagrams kısmından karşımıza çıkan iki seçenekte farklı şekillerde bize ilişkiyi gösterir tek bir classı seçp de yapılabilir
}
