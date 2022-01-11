package practice_12_22_2021;

public class whileLoop {
    public static void main(String[] args) {

        int a = 0;

        do {
            a = a++ + --a - (a % 3);

        }while( ++a < 4);

        System.out.println(a);
        System.out.println("---------------------------------------------");

        String str= "The whole time it was raining";

        do{
            System.out.print(str.charAt(0)); // "T o mi
            str = str.substring(3); // str="
                                    // str="ole time it was raining."
                                    // str=" time it was raining."
                                    // str="me it was raining."
                                    // str="it was raining


        }while(!str.isEmpty());

        System.out.println("---------------------------------------------");

        String input = "today it will be 100 degrees !"; // length 30;
               //   System.out.println(input.length());
        int n =0;

        while(n++ < input.length()){
            if(n == 8){
                continue;
            }
        }

        System.out.println("-------------------------------------------------");


         }



    }


