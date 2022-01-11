package day21_ForEachLoop;

import java.util.Arrays;

public class HomeWorkTask1and2 {
    public static void main(String[] args) {

        int[] numbers = {75, 69, 55, 46, 32, 10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("-----------------------------------------------");

        int[] nums = {12, 16, 44, 55, 58, 63, 80,};
        Arrays.sort(nums);
        int even = 0;
        int odd = 0;

        for (int each : nums) {
            if (each%2==0){even++;}else{odd++;}
        }

        System.out.println(even + " even\n" + odd + " odd");




    }

}

        /*
Tasks:
	1. Write a program that sort the array of integer in descending order

	2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop





         */


