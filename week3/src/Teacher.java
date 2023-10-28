import java.util.Date;

public class Teacher {
    private int teacherID;
    private String teacherName;
    private Date teacherDOB;
    private String teachingSubject;

    public Teacher(int teacherID, String teacherName, Date teacherDOB, String teachingSubject) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.teacherDOB = teacherDOB;
        this.teachingSubject = teachingSubject;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public Date getTeacherDOB() {
        return teacherDOB;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void updateSubjectResult(Student student, int newResult) {
        Date updatedIn = new Date();
        int updatedBy = teacherID;
        SubjectResult result = new SubjectResult(teachingSubject, newResult, updatedIn, updatedBy);
        student.getSubjectResults().add(result);
    }
}
