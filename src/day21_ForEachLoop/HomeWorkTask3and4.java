package day21_ForEachLoop;

public class HomeWorkTask3and4 {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5};
        int[] arr2 ={4,5,6,7,8};

        String result= "";

        for (int eacharr1: arr1) {
            for(int eacharr2 : arr2){
                if (eacharr1 == eacharr2){result += eacharr1 + " ";}

                }
            }
        System.out.println(result.trim());

        }



    }

/*
    3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops


    4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2



 */