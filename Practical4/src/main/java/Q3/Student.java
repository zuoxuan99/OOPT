package Q3;

public class Student {

    private String studentID;
    private String studentName;
    private int quizCount;
    private int totalScore;
    private static int contribution;

    public Student() {
//        studentID = "";
//        studentName = "";
//        quizCount = 0;
//        totalScore = 0;

        this("", "");
    }

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static void setContribution(int contributionPercentage) {
        contribution = contributionPercentage;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public static int getContribution() {
        return contribution;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public double getAverageScore() {
        return (double) totalScore / quizCount;
    }

    public void addQuiz(int score) {
        if (score > 10) {
            score = 10;
        }
        totalScore = totalScore + score;
        quizCount = quizCount + 1;
    }

}
