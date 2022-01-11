package HomeWork;


public class TaskReverse {
    public static void main(String[] args) {

        String sentence="i like learning Java";

        String[] words = sentence.split(""); // this include all Learning Java is hard

         String reverse="";

        for (int i = words[2].length()-1; i >= 0; i--){
            reverse += words[2].charAt(i);
        }
        System.out.println(reverse);


    }
}
