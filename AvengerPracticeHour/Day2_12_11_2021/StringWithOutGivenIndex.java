package Day2_12_11_2021;

public class StringWithOutGivenIndex {
    public static void main(String[] args) {

        String word = "kitchen";
        int index = 2;  // kichen
                              // substring method
        String temp = word.substring(0,index)+ word.substring(index+1);
        System.out.println("temp = " + temp);

        System.out.println("------------------------------------------------");

        String temp2 = ""; // defined another variable for 2nd solution using for-loop;

        for (int i = 0; i < index; i++) {
            temp2 += word.charAt(i);
        }
        for (int i = index+1; i < word.length() ; i++) {
            temp2 += word.charAt(i);
        }
        System.out.println("temp2 = " + temp2);

        System.out.println("--------------------------------------------------");

        String temp3 ="";

        for (int i = 0; i < word.length(); i++) {

            if (i == index)
                continue;
            temp3 += word.charAt(i);

        }


    }
}
/*
 * 4.
 * Given a non-empty string and an int n, return a new string where
 * the char at index n has been removed.
 * The value of n will be a valid index of a char in the original string
 * (do with for loop)
 * input:  kitchen and 2
 *   output: kichen
 * input:  kitchen and 0
 *   output: itchen
 */