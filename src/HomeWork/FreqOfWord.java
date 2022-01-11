package HomeWork;

public class FreqOfWord {
    public static void main(String[] args) {
        String str = "PythonPythonPython";

        int frequency = 0;
        for (int i = 0; i < str.length()-5; i++) {
            String eachSub = str.substring(i, i+6);
         //   System.out.println(eachSub);

            if (eachSub.equals("Python")){
                frequency++;
            }

        }


        System.out.println(frequency);


    }
}
/*
 sentence = " PythonPythonPython"
 */