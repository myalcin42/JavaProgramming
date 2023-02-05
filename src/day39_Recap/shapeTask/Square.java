package day39_Recap.shapeTask;

public class Square extends Shape { //before inheriting you should declare additional variables

    private double side;

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        if(side <= 0){
            System.err.println("Invalid Side: " + side);
            System.exit(1);
        }

        this.side = side;
    }

    public Square(double side) { // variable declare ettikten sonra extends demenin faydası: oluşturduğumuz variable da otomatik olarak constructor a eklendi
        super("Square");
        setSide(side);
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
