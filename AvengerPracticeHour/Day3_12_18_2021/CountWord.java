package Day3_12_18_2021;

public class CountWord {
    public static void main(String[] args) {

        String sentence="Java is Java";
        String word="Java";
        int count=0;

        for (int i = 0; i < sentence.length()-word.length(); i++) {
            String temp=sentence.substring(i,i+word.length());
            if (temp.equals(word));
            count++;
        }
        System.out.println("count = " + count);

    }
}
/*
   Count the word that is given inside the sentence
                  Input:  Java is Java
                  word:   Java
                  Output: 2
 */