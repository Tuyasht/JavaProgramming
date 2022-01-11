public class Task {
    public static void main(String[] args) {

        String word="       Winter is coming     ";

        word = word.trim();

        System.out.println(word.length());
        System.out.println("-------------------------------------------------------");



        String s = "the game was tied at 2-2";
        String s2= s.substring(5);

        int index1=s.indexOf("game");
        int index2=s2.indexOf("game");

        if(index1==index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }




    }
}
