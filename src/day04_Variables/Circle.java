package day04_Variables;

public class Circle {

    public static void main(String[] args) {
        //PI, radius, diameter, area, perimeter
        double radius =5.5;

        double PI = 3.14;
        double diameter = radius * 2; //finds the diameter by multiplying the radius to 2
        double area = radius * PI; //finds the area of circle
        double perimeter = diameter * PI; //finds the perimeter of circle

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

      double num=10;
        System.out.println(num);

       int num1 = 25;
        System.out.println("Integer number is : "+num1);

        byte num2 = 8;
        System.out.println("This is byte = " + num2);

       float num3 = 45.2f;
        System.out.println("This is float = " + num3);

      String student = "Very smart";
        System.out.println("Tuya is " + student + "!");


        char Capital = 'C';

        System.out.println("This is capital " + Capital + ".");





    }



}
