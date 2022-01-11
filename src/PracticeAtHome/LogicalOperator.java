package PracticeAtHome;

public class LogicalOperator {

    public static void main(String[] args) {

      // Logical AND :
         boolean result1 = 10 > 5 && 10 > 7;
                 //         true  && true

        System.out.println(result1);

        boolean result2 = 20 > 15 && 20 > 25;
                // true && false
        System.out.println(result2);

        boolean result3 = 30 > 50 && 30 > 10;
               //          false

        System.out.println(result3);

        System.out.println("------------------------------------");

     //Logical OR; either
        boolean result4 = 100 == 200 || 100 != 300;
                    //      false   ||   true
        System.out.println( result4);

        boolean result5 = 1000 > 900 || 1000 < 2000;
                  //        true

        System.out.println(result5);

        boolean result6 = 7 < 0 || 7 > 15;
                 //        false  ||  false

        System.out.println(result6);

        System.out.println("------------------------------------");

     //Logical NOT :
         boolean result7 = !true; //false
         boolean result8 = !false; // true
         boolean result9 =  !(100 == 200);
                 //          !false ==> true

        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);


    }

}

