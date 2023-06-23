import java.util.ArrayList;
import java.util.HashMap;

public class StudentList {
    public static void main(String[] args) {

        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Chris Barry");
        studentName.add("Joe O'Donnell");
        studentName.add( "Nicole McCarthy");

        ArrayList<String> studentEmail = new ArrayList<>();
        studentEmail.add("cbarry@atu.ie");
        studentEmail.add("jOdonnell@atu.ie");
        studentEmail.add("nicolemccarthy@atu.ie");

        System.out.println(studentName);
        System.out.println(studentEmail);



    }
}
