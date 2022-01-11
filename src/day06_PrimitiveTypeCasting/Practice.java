package day06_PrimitiveTypeCasting;

public class Practice {

    public static void main(String[] args) {

        System.out.println(1000 + 2000);
        System.out.println(2.5 + 3.5);

        System.out.println(100 - 30);
        int a = 300 - 100;
        System.out.println(a);

        System.out.println(20 * 6);
        System.out.println(5.5 * 7);


        System.out.println(10/4); // will print integer num 2
        System.out.println(10.0/4); // will print decimal result 2.5
        // or both decimal
        System.out.println(10d / 4); //will print out decimal result 2.5 (upper case or lower case d)


        System.out.println( 10%4);



    }

}

/*
    Remainder % in Math:
        10 / 4 = 2.5;

        remainder: numerator - (denominator * integer result)
                      10     - ( 4 * 2 )
                      10     - 8
                      2
         20 / 6 = 3.3333.....

         remainder: 20 - ( 6 * 3 )
                    20 - 18
                    2



 */