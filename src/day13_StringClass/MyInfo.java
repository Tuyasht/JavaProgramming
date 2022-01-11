package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        scan.nextInt();

        System.out.println("Enter your gender ");
        String gender = scan.next(); // female

        scan.nextLine(); // extra nextLine

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your phone number ");
        long phone = scan.nextLong();

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state name");
        String stateName = scan.next();

        System.out.println("Enter building number");
        int buildingNum = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name");
        String street = scan.nextLine();

        scan.close();

        System.out.println("Full name: " + fullName);
        System.out.println("Gender: " +gender);
        System.out.println("Phone number: "+phone);
        System.out.println("Address: \n\t"+buildingNum+" "+street+"\n\t"+cityName+"'"+stateName+" "+zipcode);
        System.out.println("School name:"+schoolName);


    }
}
/*
            1. Enter your age (int--> nextInt() )
            2. Enter your gender (String- One word ONLY--> next() )
            3. Enter your full name (String- Multiple words--> nextLine() ):  extra nextLine() !!!
            4. Enter your phone number (long--> nextLong() )
            5. Enter your zip code (int--> nextInt() ) : extra nextLine() !!!
            6. Enter your School name (String- Can be Multiple words--> nextLine() )
            7. Enter your city name (String- Can be Multiple words --> nextLine() )
            8. Enter your state name (String- One word ONLY -->next() )
            9. Enter your building number (int --> nextInt() ): extra nextLine() !!!
            10. Enter your Street name ( nextLine() )

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in separate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name

*/