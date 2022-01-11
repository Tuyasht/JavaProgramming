package HomeWork;

public class DuplicatedCharacters {
    public static void main(String[] args) {
        String str = "AABBCCBC";
        String result = ""; //ABC

        for (int i = 0; i <= str.length()-1; i++) { // i: represents the all the index of str start from 0 zero
            String ch =  ""+str.charAt(i);//represents each character of str

            if(!result.contains(ch)) { // if character is not contained in the result
                result += ch; // the character will be added to the result
            }

        }
        System.out.println(result);
        System.out.println("-------------------------------------------------------");

        String s = "AABCCD";
        String result1 = "";//BD

        for (int i = 0; i < s.length(); i++){//i: index
            char ch = s.charAt(i);//ch: represents all character of s
            if(s.indexOf(ch) == s.lastIndexOf(ch)){//if 1st & last index numbers of characters are same
                result1 += ch;

            }
        }

        System.out.println(result1);

    }

    }
/*
Write a program that can return the unique characters from a String

            Ex: input AABCCD
                output: BD
            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
*/



/*
 Write a program that can remove the duplicated characters from a String
            Ex input: AABBCCBC
            Output: ABC
             Hint: You can add each characters of the string into another String
                  Condition: the character is not contained in the other String yet before you are adding

 */