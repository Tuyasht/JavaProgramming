package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

    String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : words) { // each: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
                                 //2 nd each loop/outer loop going to give each of elem during execution
        int count = 0;

        for (String element : words) { // element: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
            if(element.equals(each)){  // 1 st this each loop created! inner loop going to compare that elem
                    count++;              //with every single elem of Array get frequency
                }
            }

            if(count == 1){  // if count is equal to 1 that element is Unique !!!
                System.out.println(each);
            }

        }






    }
}
