package practice_12_08_2021;

public class SwitchStatementEx {
    public static void main(String[] args) {

        String animal = "CAT";
        String result = " ";

        switch(animal) {
            case "DOG":
            case"CAT":
                result ="domestic animal";
                break;
            case "TIGER":
                result ="wild animal";
                break;
            default:
                result= "unkown animal";
                break;


        }


        /* Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal */
    }
}