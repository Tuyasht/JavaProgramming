package Day2_12_11_2021;

public class EncryptPassword {
    public static void main(String[] args) {

        String password = "cydeo";
        char encrypt = 'x';
        String encryptedPass = "";

        for (int i = 0; i < password.length(); i++) {
             encryptedPass += ""+ password.charAt(i) + encrypt; // What is " " for !!!
   //     encryptedPass = encryptedPass + password.charAt(i) + encrypt; those are same statement

        }

        System.out.println("encryptedPass = " + encryptedPass);
    }
}
/*
     * 5.
     * Given a string password. Encrypt with "x" a given password
     * and print.
     * (do with for loop)   // a+=b --->  a= a+b String concatenation '+=' in loop
     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
 */






