import java.util.ArrayList;
import java.util.Scanner;
public class Manager {

    private Course course;

    public Manager(){
        course = new Course();
    }

    public void inputController(Scanner scnr){
        String first;  // first name
        String last;   // last name
        double gpa;    // grade point average

        first = scnr.next();
        //while ( first != -1) error
        while( !first.equals("-1")) {
            last = scnr.next();
            gpa = scnr.nextDouble();
            course.addStudent(new Student(first, last, gpa));
            scnr.nextLine(); //dump new line
            first = scnr.next();
        }
    }

    public void contentPrinter(ArrayList<Student> list){
        System.out.println("Dean's list:");
        for (Student student: list) {
            System.out.println(student);
        }
    }


    public static void main(String args[]) {

        ArrayList<Student> deanList = new ArrayList<Student>();
        Scanner scnr = new Scanner(System.in);
        Manager manager = new Manager();
        manager.inputController(scnr);
        deanList = manager.course.getDeansList();
        manager.contentPrinter(deanList);

    }
}
