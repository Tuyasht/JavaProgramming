package practice_12_08_2021;

import java.util.Scanner;

public class PalindromeEx {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        String result= "";

        for (int i=word.length()-1;i>=0;i--){


              result +=word.charAt(i);
        }
        boolean isPalindrome=word.equalsIgnoreCase(result);

        System.out.println(isPalindrome);
    }


}

/*
     Write a program that can check if the given String is palindrome
           Ex:
                input:          output:
                 level                   true
                 input:         output:
                    Anna                  true







 */