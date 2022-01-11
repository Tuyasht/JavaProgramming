package day20_Array;

public class TaskClassMates {
    public static void main(String[] args) {

        String[] classMates = {"Byambasuren Shishluu","Gantuya Lombo","Dulamjav Otgon","Munhtsetseg Darizav",
        "Otgonbayar Shinen", "Gerelmaa Sodnom"};

        for (int i = 0; i < classMates.length; i++) {
            String names = classMates[i];
            char first = names.charAt(0);
            char last = names.charAt(names.lastIndexOf(" ")+1);
            System.out.println(first+last);



        }

         {

        }


    }
}
