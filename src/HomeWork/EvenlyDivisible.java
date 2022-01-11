package HomeWork;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int num = 65;
        boolean num1 = num %2 == 0;
        boolean num2 = num %3 == 0;
        boolean num3 = num %5 == 0;

        System.out.println(num+ " is divisible by 2: "+num1);
        System.out.println(num+ " is divisible by 3: "+num2);
        System.out.println(num+ " is divisible by 5: "+num3);

    }
}
/*

2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */