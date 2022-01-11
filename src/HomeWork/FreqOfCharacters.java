package HomeWork;

public class FreqOfCharacters {

    public static void main(String[] args) {
        
        String str ="ABCCCDDDDDAA";

        char ch= 'D';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { // i:  indexes of str
            char eachChar = str.charAt(i); // eachChar: each character of str

            if (ch == eachChar) { // if given ch(variable) is matching with the eachChar,
                                    // then ch is appeared in the string
               frequency++;

            }
            
        }
        System.out.println(frequency);
    }
}
/*
   Write a program that can return the frequency of a char from a String
     EX: str "AAABCCCDDDDDAA"
         ch= 'D'           output; 5
 */