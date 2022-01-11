package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) { // 1st and last elements to find out

        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for(String each :words){
            System.out.println( each.charAt(0)+ ""+ each.charAt( each.length()-1 )  );
        }//                  finding 1st character              finding last index/character subtract 1
//each represent every element from this data structure

        // Jg, Cl, Wn, Es, As

    }
}
