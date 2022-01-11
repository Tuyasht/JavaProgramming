package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Jimmy";
        String lastName = "King";
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        // Full name of the person is _____
        System.out.println("Full name of the person is " + fullName );

        //___is__years old
        System.out.println(fullName + " is " + age + " years old" );

        //FullName is JobTitle, works at CompanyName, and FullName salary is salary

        System.out.println(fullName + " is " + jobTitle +", works at " + companyName
                +", and "+fullName +"'s salary is $"+salary );


        String name = "Tuya";
        String name2 = "Sharav";
        int age1 = 47;
        String profession = "Hair Stylist";
        String companyName1 = "Toka LLC";
        double salary1 = 45000;

        String fullName1 = name +" "+name2;


        System.out.println("My first name is: "+name);
        System.out.println("My last name is: "+name2);
        System.out.println("My fullname is: "+fullName1);
       // System.out.println(age1);
       // System.out.println(profession);
      //  System.out.println(companyName1);
      //  System.out.println(salary1);
        System.out.println("I'm "+ age1 + " years old, "+ profession+ ", "+ "and work at " + companyName1 +
                " with salary of "+ salary1);




    }



}
