package day31_Constructor.dinner;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder(){
        System.out.println("server "+name+ " is taking an order");
    }

    public void cleanTable(){
        System.out.println("server "+name+ " is cleaning table");
    }


    public String toString() {
        String result= "";
        if (fullTime){
            result="full-time";
        }else{
            result="part-time";
        }
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", employment status =" + result +
                '}';
    }


}
/*
  Create a class called Server

            Attributes:
                    name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

            Actions: (all void methods)

                setInfo(): sets all of the instance variables with some values taken from the parameters.
                takeOrder(): server's name + "is taking an order"
                cleanTable(): server's name + "is cleaning the table"
                toString(): Returns (String) all the information of a Server
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

 */