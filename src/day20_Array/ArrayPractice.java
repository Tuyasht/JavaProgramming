package day20_Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //store the elements: 10,20,50,70
        int[]num = {10,20,50,70}; // size: 4

        System.out.println(Arrays.toString(num));

        System.out.println("------------------------------------------------------------------");

        int[] score = new int[5]; //[0,0,0,0,0]
        score[1]=85;
        score[score.length-1]=95;
        score[3] = 75;
        score[0] = 65;
        score[2] = 55;
        System.out.println( Arrays.toString(score)); //[65, 85, 55, 75, 95]

        System.out.println("--------------------------------------");

        System.out.println("------------------------------------------");
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};  //0 ~ 11 (length -1)

/*
        System.out.println( months[0] ); // Jan
        System.out.println( months[1] );// "Feb
        System.out.println( months[2] );
        System.out.println( months[3] );
        System.out.println( months[4] );
        System.out.println( months[5] );
        System.out.println( months[6] );
        System.out.println( months[7] );
        System.out.println( months[8] );
        System.out.println( months[9] );
        System.out.println( months[10] );
        System.out.println( months[11] );
*/

        for(int i = 0; i < months.length; i++){ //i: represents the index numbers of array starting from 0
            System.out.println( months[i] );
        }

        System.out.println("-----------------------------------------------");

        for(int i = months.length-1; i >= 0; i--  ){//i: represents the index numbers of array starting from last index
            System.out.println(months[i]);
        }






    }

}
