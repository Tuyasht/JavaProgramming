package PracticeAtHome;
import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter math operator:");
        char ch = scan.next().charAt(0) ;

        while (!(ch == '/' || ch == '*')) {
            System.err.println("Invalid operator");
            System.err.println("Enter valid operator");
            ch = scan.next().charAt(0);
        } if (ch == '*') {
            int result =0;
            for (int i = 0; i < num1 ; i++) {
                result += num2;
            }
            System.out.println(result);
        } else {
            if (num1 > num2) {
                int count =0 ;
                for (int i = 0; i < num1; i++) {
                    num1 -= num2;
                    count ++;

                }
                System.out.println(count);
            } else {
                System.err.println("Invalid numbers. " + num2 + " is greater than " + num1);
            }
        }

        scan.close();


    }
}
