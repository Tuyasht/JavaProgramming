package Day4_01_08_2022;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(4, 2));
        System.out.println(subtract(4, 2));
        System.out.println(multiply(4, 2));
        System.out.println(divide(4, 2));

    }

/*
  Question:
          -Implementation of add, subtract, multiply and divide methods in Calculator class
          -add(4,2)return 6
          -subtract(4,2) return 2
          -multiply(4,2) return 8
          -divide(4,2) return 2
 */
      // Implementation of add method

    public static int add(int num1, int num2) {
     return num1+num2;
 }

         // Implementation of subtract method

    public static int subtract(int num1, int num2){
        return num1-num2;
    }

         // Implementation of multiply method

    public static int multiply(int num1,int num2){
        return num1*num2;
    }

         // Implementation of divide method

    public static int divide(int num1, int num2){
        return num1/num2;
    }

     }
