package Replit;

import java.util.Scanner;

public class task2{
    public static void main(String[] args) {

        double num1, num2, num3, num4, sum;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 4 numbers");

        num1=scan.nextDouble();
        num2=scan.nextDouble();
        num3=scan.nextDouble();
        num4=scan.nextDouble();

        sum=num1+num2+num3+num4;

        System.out.println("Total: "+sum);

    }

}
