

import java.time.LocalDate;

public class StudentList {
    private String studentId;
    private String studentName;
    private String studentEmail;
    private String studentLocation;
    private LocalDate studentDob;

    public StudentList(String studentId, String studentName, String studentEmail, String studentLocation, LocalDate studentDob) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentLocation = studentLocation;
        this.studentDob = studentDob;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentLocation() {
        return studentLocation;
    }

    public void setStudentLocation(String studentLocation) {
        this.studentLocation = studentLocation;
    }

    public LocalDate getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(LocalDate studentDob) {
        this.studentDob = studentDob;
    }

    @Override
    public String toString() {
        return "StudentList{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentLocation='" + studentLocation + '\'' +
                ", studentDob=" + studentDob +
             