package day39_Recap.shapeTask;
public class Rectangle extends Shape {
    private double length, width;

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        if(length <= 0){
            System.out.println("Invalid length: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public void setWidth(double width){
        if(width <= 0){
            System.out.println("Invalid width: " + width);
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
