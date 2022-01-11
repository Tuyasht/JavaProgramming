package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.name="Tuya";
        employee1.salary=110000;

        Employee employee2=new Employee();
        employee2.name="Gerelee";
        employee2.salary=115000;

        Employee employee3=new Employee();
        employee3.name="Solongo";
        employee3.salary=120000;

        System.out.println(employee1.name+" : "+employee1);
        System.out.println(employee2.name+" : "+employee2);
        System.out.println(employee3.name+" : "+employee3);

    }



}
