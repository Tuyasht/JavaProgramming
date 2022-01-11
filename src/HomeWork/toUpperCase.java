package HomeWork;

public class toUpperCase {
    public static void main(String[] args) {
        String str="Java";
        str=str.toUpperCase();
        System.out.println(str);

        System.out.println("---------------------------------");

        String s1 = "I love Java";
        //index:     012345
        String result1 = s1.substring(2, 5+1);

        System.out.println(result1);
    }
}
