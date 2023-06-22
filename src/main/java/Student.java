import java.time.LocalDate;

public class Student {

    private String student_id;
    private String name;
    private String email;
    private LocalDate dob;
    private String location;

    public Student(String student_id, String name, String email, LocalDate dob, String location) {
       setStudentId(student_id);
       setName(name);
       setEmail(email);
       setDob(dob);
       setLocation(location);
    }


    public String getStudentId() {
        return student_id;
    }

    public void setStudentId(String student_id) {
        if(student_id.length() >= 4 && student_id.length() < 7){
            this.student_id = student_id;
        }
        else{
            String message = "Invalid student id number Entered!";
            throw new IllegalArgumentException(message);
        }
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
                "studentId=" + student_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", location='" + location + '\'' +
                '}';
    }
}
