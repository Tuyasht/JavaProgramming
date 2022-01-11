package day21_ForEachLoop;

import java.util.Arrays;

public class HomeWorkTask5and6 {
    public static void main(String[] args) {

        int[]arr1 = {30, 10, 20};
        int[]arr2 = {15, 40, 25, 35};
        int[]arr3 = {8, 9, 17, 5, 4, 1};

        int[] result = new int[arr1.length+ arr2.length+ arr3.length];

        int count = 0; //for finding the index number of new array

        for(int each : arr1){
            result[count++] = each;
        }
        for (int each : arr2){
            result[count++] = each;
        }
        for (int each : arr3) {
            result[count++] = each;

        }

        System.out.println(Arrays.toString(result));
        System.out.println("----------------------------------------------");


    }
}
/*
1. Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today

2. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java


   5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}


	6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)


 */