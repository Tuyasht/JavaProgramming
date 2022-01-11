package HomeWork;

import java.util.Locale;

public class TaskReplacement {
    public static void main(String[] args) {

        String str = "xcodex";
        str = str.replaceFirst("x","a");
        System.out.println(str);


     String str1 = "xcodeX";
        String result = str.replace("x", "a").replace("X", "a");


        System.out.println(result);
/*

 input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */
        String firstName = "cyDEo";
                        //  01234
        String lastName = "SCHOOL";

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1,firstName.length()).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1,lastName.length()).toLowerCase();
        System.out.println(firstName);
        System.out.println(lastName);




    }
}
/*
Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */