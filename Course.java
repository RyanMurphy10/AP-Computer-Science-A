import java.util.ArrayList;

public class Course {

    private ArrayList<Student> roster; // Collection of Student objects

    public Course() {
        roster = new ArrayList<Student>();
    }

    // Return an ArrayList of all Students with a GPA of at least 3.5
    public ArrayList<Student> getDeansList() {
        /* Type your code here */
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student s : roster) {
            if (s.getGPA() >= 3.5) {
                result.add(s);
            }

        }
        return result;
    }

    public void addStudent(Student s) {
        roster.add(s);
    }

}
