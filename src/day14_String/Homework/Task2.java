package day14_String.Homework;
import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.println(" Enter a word");

        String word1= scan1.next();

        String word2= word1.substring(word1.length()-2);
        System.out.println("word2 = " + word2);

        if(word2.equals("ly")){
            System.out.println("Really");
        }else{
            System.out.println("never mind");}

    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print "really???" ,
 otherwise, print "never mind"

 */