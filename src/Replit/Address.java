package Replit;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {

//        String name="Bar Harbor Ter";
//        int street= 20210;
//        String cityName="Ashburn";
//        int zipCode=20147;
//        String state= "VA";
//
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your street name:");
        String streetName=scan.nextLine();

        System.out.println("Enter your street number:");
        int streetNumber= scan.nextInt();

        scan.nextLine();

        System.out.println("City name:");
        String cityName=scan.nextLine();

        System.out.println("Zip code");
        int zipCode= scan.nextInt();

        System.out.println("State");
        String state= scan.next();

        String address=streetNumber +" "+streetName +", "+ cityName +" "+state+", "+ zipCode+".";


        System.out.println( address);



    }
}
