package day21_ForEachLoop;

import java.util.Arrays;

public class TaskReverseSentence {
    public static void main(String[] args) {

        String[] sentence = {"Today is a good day to learn Java"};

         String [] reversed = new String[sentence.length];// to make sure the new array to have enough capacity to
                        //contain all elements of 1st array

        for (int i = sentence.length - 1, j=0 ; i >= 0; i--, j++) {
            reversed[j] = sentence[i];

        }

        System.out.println(Arrays.toString(reversed));




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
 */