package Day3_12_18_2021;

public class TwoDigitsWithNestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=9; i++) {
            for (int j = 0; j <=9 ; j++) {
                int ij=10*i+j;
                System.out.print(ij+" ");
            }

        }


    }
}
/*
  Writing two digits numbers with nested loop
       hint:  AB = 10*A+B
 */