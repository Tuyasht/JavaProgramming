package HomeWork;

public class TaskIdentifyNumber {
    public static void main(String[] args) {
        int num = 200;
        boolean num1 = num > 0;
        boolean num2 = num < 0;
        boolean num3 = num == 0;

        System.out.println(num +" is positive number: " + num1);
        System.out.println(num +" is negative number: " + num2);
        System.out.println(num +" is zero: " + num3);


    }
}
/*
 Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false

 */