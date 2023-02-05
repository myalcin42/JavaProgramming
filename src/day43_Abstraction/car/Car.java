package day43_Abstraction.car;

public abstract class Car { // sadece abstract class ya da interface abstract metot içerebilir o yüzden classı da abstract yaptık

    private final String brand,model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if(year < 1886){
            throw new RuntimeException("Invalid year: " + year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if(price <= 0) {
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

    public void stop(){

    }

    public abstract void start(); // meant to be overridden ( final ve abstract aynı anda yazılamaz)parent classda farklı implementation olan metot hakkında endişelenmesi gereken child class bu yüzden burada bu metodu abstract yapıyoruz ve abstract metotta body(metot bloğu) olmuyor

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
