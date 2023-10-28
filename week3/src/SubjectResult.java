import java.util.Date;

public class SubjectResult {
    private String subjectName;
    private double subjectResult;
    private Date updatedIn;
    private int updatedBy;

    public SubjectResult(String subjectName, double subjectResult, Date updatedIn, int updatedBy) {
        this.subjectName = subjectName;
        this.subjectResult = subjectResult;
        this.updatedIn = updatedIn;
        this.updatedBy = updatedBy;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getSubjectResult() {
        return subjectResult;
    }

    public Date getUpdatedIn() {
        return updatedIn;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }
}
