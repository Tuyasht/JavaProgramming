package HomeWork;

public class TaskSubstring {
    public static void main(String[] args) {

    // substring(begIndex); creates substring starting from 1st index to end of the String,
        String str1 = "Java Programming Language";
        String result = str1.substring(str1.indexOf("P"));

        System.out.println(result);

    // substring(begIndex, endingIndex); creates substring starting from given begIndex to given endingIndex.

       String result1=str1.substring(5,16); // ending index is excluded
        System.out.println(result1);

        String result2=str1.substring(str1.indexOf("P"), str1.lastIndexOf(" "));
        System.out.println(result2);

        String s1 = "I love Java";
        String result3=s1.substring(2, 5+1);

        System.out.println(result3);


    }
}
