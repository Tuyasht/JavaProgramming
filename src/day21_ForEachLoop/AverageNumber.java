package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {

    int[] numbers = {10,20,30,40,50,60};

    double sum = 0;                     // find the sum of above numbers than add the sum in to numbers
                                       // to find average num ,sum divided to length of numbers!
        for (int number : numbers) {
            sum += number;
        }
           double average = sum/ numbers.length;

        System.out.println("average = " + average);

    }
}
