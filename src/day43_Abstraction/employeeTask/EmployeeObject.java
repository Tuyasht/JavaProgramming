package day43_Abstraction.employeeTask;

public class EmployeeObject {

    public static void main(String[] args) {

      //  Person person = new Person("Josh",35,'M');
     //   Employee employee = new Employee("Ali",30,'M');

       Tester tester = new Tester("Ali",30,'M',42,"SDET",145000);
       Developer developer = new Developer("Alex",28,'M',35,"Web Developer",155000);
       Teacher teacher = new Teacher("Angel",29,'F',16,"English Teacher",850000);
       Driver driver = new Driver("John",34,'M',42,"Lift Driver", 75000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("=============================================================");


        developer.work();
        developer.sleep();
        // developer.bugReport();
        developer.eat();
        developer.unitTest();

        System.out.println("-----------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();





    }
}
