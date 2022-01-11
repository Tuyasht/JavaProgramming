package day14_String.Homework;

public class PracticeReplace {

    public static void main(String[] args) {
    //replace(old value,new value): replace all the matching character(s) of the String with the with
    //given new character(s).

        String str1 = "Wooden Spoon";
        str1 = str1.replace("o","e");
        System.out.println(str1);

    String sentence1 = "I love Java, Java is the best programming language";
    sentence1=sentence1.replace("Java","C#");//I love C#, C# is the best prog Language
        System.out.println(sentence1);

    sentence1 = sentence1.replace("C#","Java");//replace back the Java back
        System.out.println(sentence1);
        System.out.println("----------------------------------------------------");

    //replace the 1st matching character of the String with the with given new character.
        String str2 = "Wooden Spoon";
        str2= str2.replaceFirst("o","e");

        System.out.println(str2);

     String sentence2 = "I love Java, Java is the best programming language";
     sentence2= sentence2.replaceFirst("Java","C#");
        System.out.println(sentence2);
    }


}
