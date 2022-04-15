import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StudentTest {
    
    private Student stud;

    @BeforeEach
    public void studentCstr(){
        stud = new Student("Michael O'Neill","moneillm@gmit.ie");
    }

    @Test
    public void testName(){
        assertEquals("Michael O'Neill",stud.getName());
    }

    @Test
    public void testEmail(){
        assertEquals("moneillm@gmit.ie",stud.getEmail());
    }

}
