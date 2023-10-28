import java.util.ArrayList;
import java.util.Date;

public class Student {
    private int studentID;
    private String studentName;
    private Date studentDOB;
    private ArrayList<SubjectResult> subjectResults;

    public Student(int studentID, String studentName, Date studentDOB) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentDOB = studentDOB;
        this.subjectResults = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    /*public void updateResult (String subjectName, double subjectResult, Date updatedIn, int updatedBy) {
        SubjectResult result = new SubjectResult(subjectName, subjectResult, updatedIn, updatedBy);
        subjectResults.add(result);
    }*/

    public ArrayList<SubjectResult> getSubjectResults() {
        return subjectResults;
    }

    public ArrayList<SubjectResult> resultQuery() {
        return subjectResults;
    }
}
