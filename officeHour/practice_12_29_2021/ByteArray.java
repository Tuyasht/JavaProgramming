package practice_12_29_2021;

public class ByteArray {
    public static void main(String[] args) {

        byte[]b=new byte[5];

        for (int j = 0; j < b.length; j++) {
            b[j]=(byte)(b[j]*2);
        }
        System.out.println(b); //this is not right, print out hashcode
        // System.out.println(Arrays.toString(b) ); bcs its an Array


    }


}
