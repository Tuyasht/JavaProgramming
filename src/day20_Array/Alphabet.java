package day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabet = new char[26];// Z~A

        alphabet[0] = 'Z';
        alphabet[1] = 'Y';

       // System.out.println(alphabet); // give/print hashcode

        System.out.println(Arrays.toString(alphabet));// print the whole array
        System.out.println( alphabet[0]);// printing the element of array



    }
}
