package day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square); // Square{side=10.0, area='100.0', perimeter='40.0'} overrridden toString method is executed

//        square.side = 20; side variable private bu şekilde çağrılamaz

        square.setSide(15); // side 10 iken 15 oldu

        System.out.println(square);

        System.out.println("======================================");

        Rectangle rectangle = new Rectangle(5,6);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println(rectangle.getLength()); // 10.0

        System.out.println(rectangle.getName()); // Rectangle

        System.out.println("============================================");

        Circle circle = new Circle(7.5);

        System.out.println(circle);

        circle.setRadius(15.5);

        System.out.println(circle.getRadius()); // 15.5

        System.out.println(circle.getName());

    }
}
