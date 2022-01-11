package PracticeAtHome;
import java.util.Scanner;

public class Task4Divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 15 != 0) {
                continue;
            }

            System.out.print(i + "  ");
        }
        System.out.println("\n-----------------------------");
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 15 == 0) {
                    continue;
                }
                System.out.print(i + "  ");
            }
        }
        System.out.println("\n----------------------------");
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                if (i % 15 == 0) {
                    continue;
                }

                System.out.print(i + "  ");
            }
        }
        scan.close();

    }


}
