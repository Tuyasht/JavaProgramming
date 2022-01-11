package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David", " Ahmed", "Jimmy", "Daniel","Aaron","David", "Shay"));

        employees.retainAll( Arrays.asList("Ahmid", "David"));

        System.out.println(employees);

        System.out.println("------------------------------------------------------");

        String[] names= {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};



    }
}
