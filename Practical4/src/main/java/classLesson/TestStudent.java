package classLesson;

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student("Ali", 3.5);
        Student s2 = new Student();
        Student s3 = new Student();

        s2.setName("Abu");
        s2.setGPA(4.1);

        System.out.println("Student 1");
        System.out.println("Name : " + s1.getName());
        System.out.println("GPA : " + s1.getGPA() + "\n");

        System.out.println("Student 2");
        System.out.println("Name : " + s2.getName());
        System.out.println("GPA : " + s2.getGPA() + "\n");

        System.out.println("Student 3");
        System.out.println("Name : " + s3.getName());
        System.out.println("GPA : " + s3.getGPA());
    }
}
