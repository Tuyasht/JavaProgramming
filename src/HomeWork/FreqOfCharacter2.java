package HomeWork;

public class FreqOfCharacter2 {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; //a2b1c3d1


        for (int j = 0; j < str.length(); j++) { //outer loop j responsible to find each character from string

            char ch =str.charAt(j);// 'a'
            int count= 0;

            for (int i = 0; i < str.length(); i++) { // inner loop responsible to find frequency of each character

                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }
            if (result.contains(""+ch)){ // creating if condition to avoiding duplicate the character
                          // and " " to convert to string
                continue; // give continue statement
            }

            result+= ch;  // concating character
            result+= count; //concating frequency

        }


        System.out.println(result);
    }
}
