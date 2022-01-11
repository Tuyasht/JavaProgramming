package Day3_12_18_2021;

public class LoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("---------------------------------------------------");
        // even number from 0 to 100
        for (int i = 0; i < 100; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("---------------------------------------------------");
        // odd number from 0 to 100
        for (int i = 1; i < 100; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("---------------------------------------------------");
        // divided number from 5 to 100
        for (int i = 0; i < 100; i+=5) {
            System.out.print(i + " ");
        }

        System.out.println("---------------------------------------------------");
    // even number from 100 to 0
        for (int i = 100; i>0; i-=2) {
        System.out.print(" "+i);




    }
    }
}

/*
                 Classic for-loop counting up From 0 to 99
                 0, 1,2,3,,,,,99
                 Initialize int i = 0
                 test i < 100
                 increment i++
 */