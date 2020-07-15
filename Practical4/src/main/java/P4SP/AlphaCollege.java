// Self Practice
package P4SP;

public class AlphaCollege {

    public static void main(String[] args) {

        Course course1 = new Course("Introduction to Computers", 250);

        course1.addStudent("Ali Said");
        course1.addStudent("Wong Ken");
        course1.addStudent("Peter Lim");

        System.out.println(course1.toString());

        System.out.printf("Total Fees Collected : RM %.2f\n", course1.calFeesCollected());

        System.out.println("Enrolled Student: ");
        for (int x = 0; x < course1.getNoOfStudents(); x++) {
            System.out.println((x + 1) + ". " + course1.getStudentNames(x));
        }

    }
}
