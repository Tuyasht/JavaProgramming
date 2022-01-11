package Replit;

import java.util.Scanner;
import java.util.SplittableRandom;

public class PatientInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to out patient portal");
        System.out.println("Please enter your information");

        System.out.println("Enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();
        scan.nextLine();

        System.out.println("Enter street number");
        int streetNumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your street name");
        String streetName = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println("Enter your cell phone");
        long phoneNumber = scan.nextLong();

        System.out.println("Enter your work phone");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your email");
        String email = scan.next();


        System.out.println("Patient information\nFull name: "+ firstName +" "+ lastName);

        System.out.println("Age: "+age+"\nHeight: "+height+"\nWeight: "+weight+" pounds\nMarried?: "+isMarried);

        System.out.println("Address: "+streetNumber+" "+streetName+", "+city+", "+state+" "+zipCode);

        System.out.println("Contacts: cell phone number-"+phoneNumber+", work phone number- "+workPhoneNumber+", email: "+email);

        scan.close();




    }
}
