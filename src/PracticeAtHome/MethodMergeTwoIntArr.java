package PracticeAtHome;

import java.util.Arrays;

public class MethodMergeTwoIntArr {
    public static void main(String[] args){

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        System.out.println(Arrays.toString(mergeArr(arr1, arr2)));
    }

    public static int[] mergeArr(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0;

        for (int i = 0; i <= arr1.length - 1; i++) {
            arr3[i] = arr1[i];
            j++;
        }
        for (int k = 0; k < arr2.length; k++) {
            arr3[j] = arr2[k];
            j++;
        }
        return arr3;
    }

}
/* 1. create a method that can merge two integer arrays.          merger(int[] arr1, int[] arr2)

         2. create a method that can merge two double arrays.          merge(double[] arr1, double[] arr2)

         3. create a method that can merge two char arrays.           merge(char[] arr1, char[] arr2)

         4. create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)
 */