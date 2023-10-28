import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Tracy", new Date(2000, 1, 1));
        Teacher teacher = new Teacher(101, "Teacher Smith", new Date(1988, 5, 5), "Math");

        teacher.updateSubjectResult(student, 100);

        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Date of Birth: " + student.getStudentDOB());

        System.out.println("Subject Results:");
        for (SubjectResult result : student.resultQuery()) {
            System.out.println("Subject: " + result.getSubjectName());
            System.out.println("Result: " + result.getSubjectResult());
            System.out.println("Updated In: " + result.getUpdatedIn());
            System.out.println("Updated By: " + result.getUpdatedBy());
        }
    }
}
