package Day1_12_04_2021;

public class CastingPractices {
    public static void main(String[] args) {
        //byte to short
        byte b = 10;
        short s = b; //implicit casting

        //double to int

        double d = 5.3;
        int i = (int)d; //explicit casting

        //long to int

        long l = 9999999999l;
        int k = (int)l;

        System.out.println("k = " + k);

        float f = 12.12f;// or double f = 12.12;

    }
}
