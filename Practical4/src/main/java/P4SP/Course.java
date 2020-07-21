// Self Practice
package P4SP;

public class Course {

    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames = new String[100];
    private static int courseCount = 0;

    public Course() {
        courseTitle = "";
        feesPerStudent = 0.0;
        noOfStudents = 0;
    }

    public Course(String courseTitle) {
        this(courseTitle, 0.0);
    }

    public Course(String courseTitle, double feesPerStudent) {
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        noOfStudents = 0;
        courseCount += 1;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public String getStudentNames(int noOfStudent) {
        return studentNames[noOfStudent];
    }

    public double calFeesCollected() {
        return feesPerStudent * noOfStudents;
    }

    public void addStudent(String studName) {
        studentNames[noOfStudents] = studName;
        noOfStudents++;
    }

    public String toString() {
        return "Course Title : " + courseTitle + "\n"
                + "Fees Per Student : RM " + feesPerStudent + "\n"
                + "Number Of Student : " + noOfStudents + "\n"
                + "Total Course : " + courseCount + "\n";
    }

}
