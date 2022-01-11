package day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) { //this is a nested loop task

    String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names) { //each strings"Elminur Ablimit", "Ali Kilic", "Hulya Keles",,,,,,
            String reversed = "";

            for (int i = each.length()-1; i >=0 ; i--) {
                reversed += each.charAt(i); // for loop is in side the for each loop & its also nested loop
                                            //inner loop helps the string reverse & outer loop repeats the steps
            }                              // for every single string

            System.out.println(reversed);

        }

        }



    }

