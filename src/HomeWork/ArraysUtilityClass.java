package HomeWork;


import java.util.Arrays;

public class ArraysUtilityClass {
    public static void main(String[] args) {

    // toString(); converts array object to string, returns String
        String[]names={"Jonh","Smith","Shay","Breanna","Josh"};
        System.out.println(Arrays.toString(names));
        System.out.println("-----------------------------------------------------");

    //sort(); sorts the array in ascending order
        int[]numbers={5,1,3,4,2,0};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("--------------------------------------------------------");

    // equals(); compares two array objects if they have same elements in same order
        char[]arr1={'a','b','c'};
        char[]arr2={'a','b','c'};
        System.out.println(arr1==arr2);
        System.out.println(Arrays.equals(arr1,arr2));

    //copyOf(array, newLength): copies the specified array elements and sets new length, returns new Array
        int[]score={45,55,65,75,85};



    // copyOfRange(array, begIndex, endIndex): copies the specified range of the array, returns new Array

    }
}
