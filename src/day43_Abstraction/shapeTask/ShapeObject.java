package day43_Abstraction.shapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        Circle circle = new Circle(5.5);
        circle.area();
        circle.perimeter();
        System.out.println(circle);

        System.out.println("====================================");

        Square square = new Square(5.8);
        square.area();
        square.perimeter();
        System.out.println(square);

        System.out.println("====================================");

        Rectangle rectangle = new Rectangle(4.5,3.5);
        rectangle.area();
        rectangle.perimeter();
        System.out.println(rectangle);
    }



}
