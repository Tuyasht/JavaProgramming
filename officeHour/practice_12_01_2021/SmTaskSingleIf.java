package practice_12_01_2021;

public class SmTaskSingleIf {
    public static void main(String[] args) {

        int y = 20;
        int x = 5;

        if (y==20){
            System.out.println("When y is equal to 20: x is "+x);
        }
        System.out.println("_-----------------------------------------");

        int hour = 41;
        int payRate ;

        if (hour>40){
            System.out.println("payRate = payRate * 1.5");
        }

        System.out.println("----------------------------------------------------");


       int b = 50;
       int c = 101;
       int a = 20;

       if (b == 50 && c > 100){
           System.out.println(a);
       }
        System.out.println("--------------------------------------------------------");

       boolean max = true;
       int fees = 45;
      if (true){
          System.out.println("fees equals "+ fees);
      }
        System.out.println("------------------------------------------------");

       int temp = 79;
      if (temp>70 && temp<80){
          System.out.println("Ideal Temp"+temp);
      }


    }
}

/*
        1-Write an if statement that assigns 5 to x when y is equal to 20
        2-Write an if statement that multiplies pay rate by 1.5 if hours is greater than 40
        3-Write an if statement that sets the variable fees to 50 if the boolean variable max is true
        4-Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80
        5-Write an if statement that assigns 20 to the variable a if variable b is 50 AND c is greater than 100

 */