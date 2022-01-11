package day31_Constructor.scrumTask;

public class Tester {

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;


    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }

    public void creatingTickets(){
        System.out.println(name+" is creating ticket");
    }
}
/*
    create a class called Tester
         Attributes; name, employeeID
             Add A constructor that can set all the fields
	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */