import java.time.LocalDate;

public class Student {

    private int studentId;
    private String name;
    private String email;
    private LocalDate dob;
    private String location;

    public Student(int studentId, String name, String email, LocalDate dob, String location) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.location = location;
    }

    public Student(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", location='" + location + '\'' +
                '}';
    }
}
