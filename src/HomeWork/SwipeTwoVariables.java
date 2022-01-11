package HomeWork;

public class SwipeTwoVariables {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b );

    }
}
/*
 write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.com

 */

/*
1. write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */