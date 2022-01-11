package Day1_12_04_2021;

public class StringPractice {
    public static void main(String[] args) {

        String str = "Hello";
        str = str.toUpperCase();
        String s  =" "+ str.charAt(0) + str.charAt(1);
        System.out.println("s = " + s);

        System.out.println("----------------------------------------------------");

        String str1 = "Hello";
        str1 = str1.toUpperCase();
        System.out.println("str1= " + str1.substring(0, 2));

        System.out.println("------------------------------------------------------");

        String str2 = "CYDEO";
        int lastIndexOfChar = str2.length()-1;
        int lastsecondOfChar = str.length()-2;
        String result =" "+ str2.charAt(lastsecondOfChar)+str2.charAt(lastIndexOfChar);

        //System.out.println(result+result+result);
        System.out.println("result = " + result.repeat(3));
        System.out.println("-------------------------------------------------");

        String str3 = "Selcuk"; // elcu
        String svar = str3.substring(1, str.length());
        System.out.println( svar);


    }
}
/*
    1.Given a string , print the string made of its first two chars,
       so the String "Hello" yeilds "HE"
 */
/*
    2. Create a method print a new string made of 3 copies of the last two chars of the original string.
       the string length will be at least 2.
    3. Given a string returns a version without the 1st & last char, so "Hello" yeilds "ell".

 */