package Q2;

public class Student {

    private String studentID;
    private String studentName;
    private int quizCount;
    private int totalScore;

    public Student() {
        studentID = "";
        studentName = "";
        quizCount = 0;
        totalScore = 0;
    }

    public Student(String id, String name) {
        studentID = id;
        studentName = name;
    }

    public void setStudentID(String sID) {
        studentID = sID;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
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
