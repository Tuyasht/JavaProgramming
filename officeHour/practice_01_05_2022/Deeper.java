package practice_01_05_2022;

public class Deeper {

    public static void main(String[] args) {

        System.out.println("Not Deep");  //printing this 1st
        deep();
        System.out.println("Not Deep"); // 5th, come back to main method!

    }

    public static void deep(){

        System.out.println("Deep"); // printing this 2nd
        deeper();
        System.out.println("Deep"); // 4th

    }

    public static void deeper(){
        System.out.println("Deeper"); // printing this 3rd

    }
}
