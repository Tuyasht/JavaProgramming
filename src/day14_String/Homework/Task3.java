package day14_String.Homework;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        String word1= word.substring(0,1);
        System.out.println("word1 = " + word1);

if (word1.equals("x")){
    System.out.println(word.substring(1));
}

    }
}
/*
. Ask user to enter a word. If the word starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

 */