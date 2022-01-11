package day22_MultiDimensionalArray;
import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

            String[] words = sentence.split(" "); //[I, Love, Java]

            String reverse ="";

            for(int i = words[1].length()-1; i >= 0; i-- ){
                reverse += words[1].charAt(i);   //can change with any index num in string
            }

            System.out.println(reverse);

            //  sentence = sentence.replaceFirst(words[1], reverse); //this is other way to do it

            words[1] = reverse;
            System.out.println(Arrays.toString(words));

            for (String word : words) {
                System.out.print(word +" ");
            }


    }

    }
/*
 Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */