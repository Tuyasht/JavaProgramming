package practice_12_15_2021;

import java.util.Scanner;

public class StringTimes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word.");

        String word = input.nextLine();
        System.out.println("Enter any positive number");

        int num=input.nextInt();

 //       int count =0;
        String sum="";
/*
        while(count<num){              // this is using-while loop
            sum +=word;
            count++;
        }
        System.out.println(sum);
*/
        for (int i = 0; i < num; i++) {      // this one using-for loop

        }
        System.out.println(sum);




    }
}
/*
    Given a string and non-negative int n, return a large string that is n copies of original string.

      input String: Hi,      input int: 3
      output: HiHiHi
 */