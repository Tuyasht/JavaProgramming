package Day3_12_18_2021;

public class WritingTillWord2 {
    public static void main(String[] args) {

        String word = "Code";
        String c=word.charAt(0)+"";  // i have C now
        String c1=""+word.charAt(0)+word.charAt(1);  // now it is Co
        String c2=""+word.charAt(0)+word.charAt(1)+word.charAt(2); // Cod
        String c3=""+word.charAt(0)+word.charAt(1)+word.charAt(2)+word.charAt(3); // Code

        String temp=" ";
        for (int i = 0; i < word.length(); i++) {

            for (int j = 0; j <= i; j++) {
                temp+=""+word.charAt(j);
            }
            temp+="-";
        }

        temp=temp.substring(0,temp.length()-1);
        System.out.println("temp = " + temp);

    /*
        String str=word.substring(0);  //str = Code
        String str1=word.substring(1,3); //str1 = od

        for (int i = 0; i <= word.length(); i++) {
            String temp = word.substring(0, i);
            System.out.print(temp);


    */
    }
}
/*
 ( do with charAt())
                     Code--> "C-Co-Cod-Code"
                     abc-->"a-ab-abc"
                     ab--> "a-ab"
 */
