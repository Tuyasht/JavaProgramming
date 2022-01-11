package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {
    public static void main(String[] args) {



        String str = "Wooden Spoon";
        str=null;
        System.out.println(str);

        String language = "Python";
        language =    "Java";

        System.out.println(language);

        System.out.println("-----------------------------------------------------");

        ArrayList<Integer> list1=new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2=list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1==list2);

        System.out.println("-------------------------------------------");



    }
}
