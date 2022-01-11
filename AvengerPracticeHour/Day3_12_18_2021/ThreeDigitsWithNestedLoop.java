package Day3_12_18_2021;

public class ThreeDigitsWithNestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=9; i++) {
            for (int j = 0; j <=99; j++) {
                for (int k = 0; k <=9 ; k++) {
                    int ijk= 100*i+10*j+k;
                    System.out.println(ijk);
                }

            }
        }
    }
}
/*
 Writing three digits numbers with nested loops
      Hint:      ABC =100*A+10*B+C
 */