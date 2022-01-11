package practice_12_22_2021;
import java.util.Arrays;

public class ArrayQuestion {
    public static void main(String[] args) {

        int[] nums= new int [5];
        int a= 5;

        nums[2] = a--;
        nums[0]= a *2;
        nums[4]= --a +(a-9);
        nums[1]= nums[2];
        nums[3]= nums[a-3];
        System.out.print(Arrays.toString(nums));

        System.out.println("---------------------------------------");

        double[] doub= new double[4];
        doub [0] = 1.0;
        doub [2] = 42.1;
        doub= new double[4];
        doub [1] = 17.2;
        doub [3] = doub.length;

        System.out.print(Arrays.toString(doub));


    }
}
