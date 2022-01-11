package day21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {

        int[] nums = {20,31,16,78,54};
        int min = nums [0];   //16

        for (int num : nums) {
            if (num < min){
                min = num;
            }
        }
        System.out.println(min);

    }
}
