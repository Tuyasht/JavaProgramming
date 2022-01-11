package PracticeAtHome;

import java.util.Scanner;

public class Task3TwoNumMathOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter math operator:");
        char ch = scan.next().charAt(0);

        while ((ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.err.println("Invalid operator, please re-enter");
            ch = scan.next().charAt(0);

        }
        if (ch == '+') {
            System.out.println(num1 + num2);
        }

    }
}