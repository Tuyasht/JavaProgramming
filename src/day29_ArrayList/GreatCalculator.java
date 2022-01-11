package day29_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class GreatCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


        ArrayList<Integer> gradeOfA = new ArrayList<>( scores); // 90 ~ 100
        gradeOfA.removeIf( p ->  !(p >= 90 && p <= 100));
        System.out.println(gradeOfA);


        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        gradeOfB.removeIf( p -> !(p >=80 && p <= 89));
        System.out.println(gradeOfB);



        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


    //    Write a program that can count the total numbers of grade A, B, C, D and F


    }
}
