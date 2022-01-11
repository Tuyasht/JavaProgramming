package practice_12_01_2021;

import java.util.concurrent.Callable;

public class PatientInfo {
    public static void main(String[] args) {

    /*Create a class named PatientInfo. declare the following variables:
                         1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double) */

    String name = "Tuya";
    int age = 47;
    char gender = 'F';
    String dateOfBirth = "08/19/1974";
    boolean isMarried = true;
    String phoneNumber = "571-235-8996";
    boolean havingInsurance = true;
    String Employer = "Cydeo";
    double copayWithInsurance = 20.00;
    double copayWithOutInsurance = 250.00;

        System.out.println("name; "+name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("dateOfBirth = " + dateOfBirth);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("havingInsurance = " + havingInsurance);
        System.out.println("Employer = " + Employer);
        System.out.println("copayWithInsurance = " + copayWithInsurance);
        System.out.println("copayWithOutInsurance = " + copayWithOutInsurance);

        System.out.println("========Escape Sequences=======");

        System.out.println("\tname: "+name+"\n\tage: "+age+"\n\tgender: "+gender);

        if(havingInsurance){
            System.out.println("copayWithInsurance= "+ copayWithInsurance);
        }else{
            System.out.println("copayWithOutInsurance = " + copayWithOutInsurance);
        }



    }
}





