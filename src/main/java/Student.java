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
        if(student_id.length() > 4 && student_id.length() <= 7){
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
        if (name.length() >= 4) {
            this.name = name;
        }
        else{
            String message = "Invalid student name Entered!";
            throw new IllegalArgumentException(message);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
       if(email.contains("@atu.ie")){
           this.email =email;
       }
       else
       {
           String message = "Invalid student email Entered!";
           throw new IllegalArgumentException(message);
       }
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        LocalDate ld = LocalDate.of(1996,05,01);
       if(dob.isAfter(ld) == true) {
           this.dob = dob;
       }
       else{
           String message = "Invalid student date_of_birth Entered!";
           throw new IllegalArgumentException(message);
       }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {

        if(location.length() >= 4){
            this.location = location;
        }
        else{
            String message = "Invalid student location Entered!";
            throw new IllegalArgumentException(message);
        }

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
