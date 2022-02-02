package practice_01_19_2022;

public class StaticAnimal {

    static String animal = "Dog"; // <--- static variable

    static {   // <--- static block
        animal = "cat"; // assigned as a cat
    }

    public static void main(String[] args) {
        StaticAnimal st1 = new StaticAnimal();  // <--- st1 Object
        st1.animal = "rabbit";                  // <--- assigned as a rabbit
        StaticAnimal st2 = new StaticAnimal();  // <--- another Object and still be rabbit
        System.out.println(st1.animal.equals(st2.animal)); // print out true

    }
}
