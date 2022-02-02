package day43_Abstraction.shapeTask;

public final class Circle extends Shape{

    private double radius;
    private static double pi;

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);


    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

   static {
        Circle.pi = 3.14;
   }

    @Override
    public void area() {
        System.out.println("Area of circle: "+(radius*radius*pi));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of circle: "+(2*radius*pi));
    }

    @Override
    public String toString() {
        return "Circle{" +
                " name='" + getName() + '\'' +
                " radius=" + radius +
                '}';
    }
}
