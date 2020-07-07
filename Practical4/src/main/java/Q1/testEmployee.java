package Q1;

public class testEmployee {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Abu", 4000);

        Employee emp2 = new Employee("Ali");
        emp2.setSalary(5000);

        System.out.println("Q1a : Raise Salary");
        System.out.println("Name : " + emp1.getName());
        System.out.println("Salary : " + emp1.getSalary());

        emp1.raiseSalary(8);
        System.out.println("Raised salary : " + emp1.getSalary() + "\n");

        System.out.println("Q1b : Set & Get\n");

        System.out.println("Q1c : Constructor, Highest salary & Total");

        if (emp1.getSalary() > emp2.getSalary()) {
            System.out.println("Name : " + emp1.getName());
        } else {
            System.out.println("Name : " + emp2.getName());
        }

        System.out.println("Total Salary : " + (emp1.getSalary() + emp2.getSalary()));
    }
}
