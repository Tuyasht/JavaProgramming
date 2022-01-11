package PracticeAtHome;
import java.util.Scanner;

public class Task5RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to reserve room");
        String answer = scan.next().toLowerCase();


        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry, please try again");
            answer = scan.next().toLowerCase();

        }
        if (answer.equals("no")) {
            System.out.println("Have anice day");
        } else {
            System.out.println("Which room would you choose");
            String room = scan.next().toLowerCase();

            while (!(room.equals("king") || room.equals("queen") || room.equals("single"))) {
                System.err.println("Invalid room, please reselect");
                room = scan.next().toLowerCase();
            }
            if (room.equals("king")) {
                System.out.println("King bed = $120.00");
            } else if (room.equals("queen")) {
                System.out.println("Queen bed = $100.00");
            } else {
                System.out.println("Single bed = $80.00");
            }


        }

        scan.close();



    }
}
