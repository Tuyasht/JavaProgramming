package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;

    final static String name; // call static block

    static {
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

      final  double pi = 3.14;
      //  pi = 4.14; final variable can not be reassigned
      //  pi = 5.4;

        final String name;
        name = " Java";

        System.out.println(name);

        System.out.println("============================================");


        FinalVariable obj = new FinalVariable("August/19");
       // obj.birthDay = "June/1"; //final variables can not be reassigning

        System.out.println(obj.birthDay);

        System.out.println("=================================================");

        System.out.println(FinalVariable.name);


    }
}
