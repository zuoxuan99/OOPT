
package classLesson;

public class Student {
    private String name;
    private double gpa;
    
    public Student() {
        name = "";
        gpa = 0.0;
    }
    
    public Student(String n, double value) {
        name = n;
        gpa = value;
    }
    
    public void setName(String n) {
        name = n;
    }
    public void setGPA(double value) {
        if(value < 0 || value > 4) {
            System.out.println("Invalid GPA");
        } else {
            gpa = value;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public double getGPA() {
        return gpa;
    }
}
