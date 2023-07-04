

import java.time.LocalDate;

public class StudentList {
    private String studentId;
    private String studentName;
    private String studentEmail;
    private String studentLocation;
    private LocalDate studentDob;

    public StudentList(String studentId, String studentName, String studentEmail, String studentLocation, LocalDate studentDob) {
        setStudentId(studentId);
        setStudentName(studentName);
        setStudentEmail(studentEmail);
        setStudentLocation(studentLocation);
        setStudentDob(studentDob);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if(studentId.length() >= 4){
            this.studentId = studentId;
        }
        else{
            String message = "Invalid Student Id Entered!";
            throw new IllegalArgumentException(message);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {

        if (studentName.length() >= 4 && studentName.length() <= 30) {
            this.studentName = studentName;
        } else{
            String message = "Invalid Student Name Entered!";
            throw new IllegalArgumentException(message);
        }
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        if(studentEmail.contains("@")){
            this.studentEmail = studentEmail;
        }else {
            String message = "Invalid Student Email Entered!";
            throw new IllegalArgumentException(message);
        }

    }

    public String getStudentLocation() {
        return studentLocation;
    }

    public void setStudentLocation(String studentLocation) {
        if (!Character.isUpperCase(studentLocation.charAt(0))) {
            String message = "Invalid Student Location Entered!";
            throw new IllegalArgumentException(message);
        }else {
            this.studentLocation = studentLocation;
        }
    }
    public LocalDate getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(LocalDate studentDob) {
        LocalDate localDate = LocalDate.of(1992,5,31);
        if(studentDob.isAfter(localDate)){
            this.studentDob = studentDob;
        }else{
            String message = "Invalid Student Date Of Birth Entered!";
            throw new IllegalArgumentException(message);
        }

    }

    @Override
    public String toString() {
        return "StudentList{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentLocation='" + studentLocation + '\'' +
                ", studentDob=" + studentDob +
             