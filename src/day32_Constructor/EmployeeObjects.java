package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee("Aaron");
        Employee employee2=new Employee("Yuliya",'F');
        Employee employee3=new Employee("Olga",'F',"QA");

        System.out.println(employee1);
        System.out.println(employee2);

    }
}
