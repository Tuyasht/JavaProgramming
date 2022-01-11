package day20_Array;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();//each user entered input will be assigned to the indexes of the array number
        }

        int max = numbers[0];
        int min = numbers[0];


    }



}
