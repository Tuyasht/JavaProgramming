package day43_Abstraction.shapeTask;

public final class Rectangle extends Shape {

    private double width, length;

    public Rectangle( double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle: "+width * length);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of rectangle: "+(2 *( width+length)));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='"+ getName() + '\'' +
                " width=" + width +
                ", length=" + length +
                '}';
    }
}
