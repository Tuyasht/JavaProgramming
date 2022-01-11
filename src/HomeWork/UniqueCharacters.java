package HomeWork;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = " "; // bdf


        for (int j = 0; j < str.length(); j++) { //outer loop picking a every single character
                      //inner loop compares the character that outer loop picked, with each character of string
            char ch = str.charAt(j);
            int count = 0; //this is frequency of the char , stored here to use later

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);// each character of str
                if (ch == each) {
                    count++;
                }
            }
            if (count == 1) { // if the freq of character is 1, then the character unique
                result += ch;
            }
            }
            System.out.println(result);

    }}

/*        char ch = 'a';
        int count = 0; //this is frequency of the char , stored here to use later

        for (int i = 0; i < str.length(); i++) {

              char each = str.charAt(i);// each character of str
              if(ch == each){
                  count++;
              }

          // this Whole thing is how to find the frequency of one character

        }
        System.out.println(count);
    }
}
/*
 Write a program that can find the unique character from a string without using indexOf() method
                Ex:  str = "aabccdeef"  , output: bdf
 */