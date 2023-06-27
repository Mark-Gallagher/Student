import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {

     
        ArrayList<String> student_Id = new ArrayList<>();
        student_Id.add("ATU1003");
        student_Id.add("ATU1004");
        student_Id.add("ATU1005");

        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Chris Barry");
        studentName.add("Joe O'Donnell");
        studentName.add("Nicole McCarthy");

        ArrayList<String> studentEmail = new ArrayList<>();
        studentEmail.add("cbarry@atu.ie");
        studentEmail.add("jOdonnell@atu.ie");
        studentEmail.add("nicolemccarthy@atu.ie");

        ArrayList<String> studentLocation = new ArrayList<>();
        studentLocation.add("Cork");
        studentLocation.add("Clare");
        studentLocation.add("Galway");

        System.out.println(student_Id);
        System.out.println(studentName);
        System.out.println(studentEmail);
        System.out.println(studentLocation);


    }
}
