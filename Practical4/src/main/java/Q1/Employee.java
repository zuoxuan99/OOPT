package Q1;

public class Employee {

    private String name;
    private double salary;

//Constructor  
    public Employee() {
        name = "";
        salary = 0.0;
    }

    public Employee(String n) {
        name = n;
        salary = 0.0;
    }

    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }
//End Constructor

//Set
    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }
//End Set

//Get    
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
//End Get    

//Function    
    void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100.0);
    }
}
