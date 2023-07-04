import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static java.util.Calendar.OCTOBER;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    
    private Student stud;

    @BeforeEach
    public void studentCstr(){
        stud = new Student("ATU1001","Declan Maher","dec-maher@atu.ie",LocalDate.of(1998, OCTOBER, 16), "Tipperary");
    }

    @Test
    public void testName(){
        assertEquals("Declan Maher",stud.getName());
    }

    @Test
    public void testEmail(){
        assertEquals("dec-maher@atu.ie",stud.getEmail());
    }

    @Test
    public void testStudentId(){
        assertEquals("ATU1001", stud.getStudentId());
    }

    @Test
    public void testStudentDob(){
        assertEquals(LocalDate.of(1998, OCTOBER, 16), stud.getDob());
    }

    @Test
    public void testLocation(){
        assertEquals("Tipperary", stud.getLocation());
    }

    @Test
    public void testToString() {
        assertEquals("Student{" +
                "studentId=" + stud.getStudentId() +
                ", name='" + stud.getName() + '\'' +
                ", email='" + stud.getEmail() + '\'' +
                ", dob=" + stud.getDob() +
                ", location='" + stud.getLocation() + '\'' +
                '}', stud.toString());
    }

    @Test
    void testConstructorInvalidId(){
        final String invalidId = "Invalid student id number Entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Student("ATU10012","Declan Maher","dec-maher@atu.ie",LocalDate.of(1998, OCTOBER, 16), "Tipperary"));
        assertEquals(invalidId,exception.getMessage());
    }

    @Test
    void testConstructorInvalidName(){
        final String invalidName = "Invalid student name Entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Student("ATU1001","Dec","dec-maher@atu.ie",LocalDate.of(1998, OCTOBER, 16), "Tipperary"));
        assertEquals(invalidName,exception.getMessage());
    }

    @Test
    void testConstructorInvalidEmail(){
        final String invalidEmail = "Invalid student email Entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Student("ATU1001","Declan Maher","dec-maher@uta.ei",LocalDate.of(1998, OCTOBER, 16), "Tipperary"));
        assertEquals(invalidEmail,exception.getMessage());
    }

    @Test
    void testConstructorInvalidDob(){
        final String invalidDob = "Invalid student date_of_birth Entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Student("ATU1001","Declan Maher","dec-maher@atu.ie",LocalDate.of(1995, OCTOBER, 16), "Tipperary"));
        assertEquals(invalidDob,exception.getMessage());
    }

    @Test
    void testConstructorInvalidLocation(){
        final String invalidLocation = "Invalid student location Entered!";
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> new Student("ATU1001","Declan Maher","dec-maher@atu.ie",LocalDate.of(1998, OCTOBER, 16), "Tip"));
        assertEquals(invalidLocation,exception.getMessage());
    }

}
