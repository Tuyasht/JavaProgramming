package PracticeAtHome;
import java.util.Scanner;

public class Task6InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.next();
        System.out.println("Enter your gender");
        char gender = scan.next().charAt(0);
        while (!(gender == 'm' || gender == 'f' || gender == 'M' || gender == 'F')) {
            System.err.println("Incorrect entry, please re-enter");
            gender = scan.next().charAt(0);
        }
        System.out.println("Are you married?");
        String marriage = scan.next().toLowerCase();
        while (!(marriage.equals("yes") || marriage.equals("no"))) {
            System.err.println("Incorrect entry, please re-enter");
            marriage = scan.next().toLowerCase();
        }
        System.out.println("Enter your age");
        int age = scan.nextInt();
        while (age < 0 && age > 120) {
            System.err.println("Incorrect entry, please re-enter");
            age = scan.nextInt();
        }
        System.out.println("Enter your daily mileage");
        int miles = scan.nextInt();
        while (miles < 5) {
            System.err.println("Incorrect entry, please re-enter");
            miles = scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Which coverage do you want");
        String coverage = scan.nextLine().toLowerCase();
        while (!(coverage.equals("full coverage") || coverage.equals("liability insurance"))) {
            System.err.println("Incorrect entry, please re-enter");
            coverage = scan.nextLine().toLowerCase();
        }

        System.out.println("Any accidents or claims in last 5 years");
        String accident = scan.next().toLowerCase();
        while (!(accident.equals("yes") || accident.equals("no"))) {
            System.err.println("Incorrect entry, please re-enter");
            accident = scan.next().toLowerCase();
        }
        System.out.println("Does your car has anti-theft device");
        String device = scan.next().toLowerCase();
        while (!(device.equals("yes") || device.equals("no"))) {
            System.err.println("Incorrect entry, please re-enter");
            device = scan.next().toLowerCase();
        }
        int quote = 0;

        if (coverage.equals("liability insurance")) {
            if (age < 25) {
                quote = 90;
            } else {
                quote = 50;
            }
            if (miles <= 10) {
                quote += 10;
            } else if (miles > 10 && miles <= 50) {
                quote += 30;
            } else {
                quote += 50;
            }
        } else {
            if (age < 25) {
                quote += 160;
            } else {
                quote += 120;
            }
            if (miles <= 10) {
                quote += 20;
            } else if (miles > 10 && miles <= 50) {
                quote += 40;
            } else {
                quote += 70;
            }

        }
        if (device.equals("yes")) {
            quote -= quote * 0.05;
        }
        if (accident.equals("yes")) {
            quote += quote * 0.15;
        } else {
            quote -= quote * 0.10;
        }
        if (marriage.equals("yes")) {
            quote -= quote * 0.05;

        }
        System.out.println(quote);

        scan.close();
    }


}
