package day09_IfStatements;

import javax.lang.model.SourceVersion;

public class MinNumber {

    public static void main(String[] args) {
        int n1 = 100,
            n2 = 200;

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean equal = n1 == n2;

        if(n1IsMin){ // is n1 is the minimum number

            System.out.println(n1+" is the minimum number");

        }
    }
   }
/*
       Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number


 */