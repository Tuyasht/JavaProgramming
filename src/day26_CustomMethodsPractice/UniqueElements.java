package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class UniqueElements {
    public static void main(String[] args) {
        int[]arr1 = {1,1,1,1,2,3,3,5};
        System.out.println();
    }

    public static int[] uniqueElements(int[] array){
        int[] result={};

        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) == 1){
                result =ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

}




