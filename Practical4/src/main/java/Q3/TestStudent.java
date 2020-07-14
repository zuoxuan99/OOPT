package Q3;

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("19WMD00002", "Alex");

        s1.setStudentID("19WMD00001");
        s1.setStudentName("Zach");

        s1.addQuiz(5);
        s1.addQuiz(8);

        s2.addQuiz(8);
        s2.addQuiz(10);

        Student.setContribution(20);

        System.out.println("Student 1");
        System.out.println("Name : " + s1.getStudentName());
        System.out.println("ID : " + s1.getStudentID());
        System.out.println("Average Score : " + s1.getAverageScore());
        System.out.println("Total Score : " + s1.getTotalScore());
        System.out.println("Contribution Mark : " + ((s1.getAverageScore() / 10) * Student.getContribution()) + "\n");

        System.out.println("Student 2");
        System.out.println("Name : " + s2.getStudentName());
        System.out.println("ID : " + s2.getStudentID());
        System.out.println("Average Score : " + s2.getAverageScore());
        System.out.println("Total Score : " + s2.getTotalScore());
        System.out.println("Contribution Mark : " + ((s2.getAverageScore() / 10) * Student.getContribution()) + "\n");

    }
}
