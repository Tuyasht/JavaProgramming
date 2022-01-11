package PracticeAtHome;

public class SubString {
    public static void main(String[] args) {

        String str1 = "Java Programming Language";
        String result1 = str1.substring(str1.indexOf("P"));

        System.out.println(result1);

        String result2 = str1.substring(5, 15+1);// or 16
        System.out.println(result2);

        String result3 = str1.substring(str1.indexOf("P"), str1.lastIndexOf(" "));
        System.out.println(result3);

        String s1 = "I love Java";
        String result4 = s1.substring(2, 6);
        System.out.println(result4);





    }
}
