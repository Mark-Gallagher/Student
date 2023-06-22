import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static java.util.Calendar.OCTOBER;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {
    
    private Student stud;

    @BeforeEach
    public void studentCstr(){
        stud = new Student(1001,"Declan Maher","dec-maher@atu.ie",LocalDate.of(1998, OCTOBER, 16), "Tipperary");
    }

    @Test
    public void testName(){
        assertEquals("Declan Maher",stud.getName());
    }

    @Test
    public void testEmail(){
        assertEquals("dec_maher@atu.ie",stud.getEmail());
    }

    @Test
    public void testStudentId(){
        assertEquals(1001, stud.getStudentId());
    }

    @Test
    public void testStudentDob(){
        assertEquals(LocalDate.of(1998, OCTOBER, 16), stud.getDob());
    }

    @Test
    public void testLocation(){
        assertEquals("Tipperary", stud.getLocation());
    }


}
