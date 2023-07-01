import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import static java.util.Calendar.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("StudentList")
public class StudentListTest {

    StudentList[] studentlist = {
            new StudentList("ATU1002","Chris Barry", "cbarry@atu.ie","Cork", LocalDate.of(1997, APRIL, 13)),
            new StudentList("ATU1003","Joe O'Donnell", "jOdonnell@atu.ie","Clare", LocalDate.of(1996, AUGUST, 24)),
            new StudentList("ATU1004","Nicole McCarthy", "nicolemccarthy@atu.ie","Galway", LocalDate.of(2000, SEPTEMBER, 07)),
    };

    @DisplayName("List & Display Students")
    @Test
    public void listStudents(){
        List<StudentList> students = Arrays.asList(studentlist);

        System.out.println("Complete StudentList:");
        students.stream().forEach(System.out::println);
    }

    @Test
    public void testStudentId(){
        assertEquals("ATU1002",studentlist[0].getStudentId());
        assertEquals("ATU1003",studentlist[1].getStudentId());
        assertEquals("ATU1004",studentlist[2].getStudentId());
    }
    
    @Test
    public void testStudentName(){
        assertEquals("Chris Barry",studentlist[0].getStudentName());
        assertEquals("Joe O'Donnell",studentlist[1].getStudentName());
        assertEquals("Nicole McCarthy",studentlist[2].getStudentName());
    }

    
    @Test
    public void testConstructorInvalidStudentId(){
        final String [] actual = new String[] {"ATU100a","ATU100b","ATU100c","ATU100d"};
        final String [] expected = new String[] {"ATU1005","ATU1006","ATU1007","ATU1008"};

        assertThat(actual)
                .overridingErrorMessage(
                        "Expected arrays to not be equal but both are: %s",
                        Arrays.toString(expected)
                )
                .isNotEqualTo(expected);

    }

    @Test
    public void testConstructorInvalidStudentName(){
        final String [] actual = new String[] {"Chriss Barryy","Joee O'Donnoll","Nickole MacCarthy"};
        final String [] expected = new String[] {"Chris Barry","Joe O'Donnell","Nicole McCarthy"};

        assertThat(actual)
                .overridingErrorMessage(
                        "Expected arrays to not be equal but both are: %s",
                        Arrays.toString(expected)
                )
                .isNotEqualTo(expected);

    }

}
