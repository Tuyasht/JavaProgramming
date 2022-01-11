package day14_String.Homework;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter first word");
        String word1=input.next();

        String newword= word1.substring(1);// substring last number is always -1

        System.out.println(newword);

        System.out.println("Enter the second word");
        String word2= input.next();

        String word3= word2.substring(1);
        System.out.println(word3);
        System.out.println(newword+word3);







        /*
        1-scanner word1
        2-scanner word2



        1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana


         */
    }
}
