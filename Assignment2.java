
// Create a list of 5 student names. Add a new name at the second position, remove the 4th student, and print the list.
// Create a set of 5 subjects, add a duplicate, and check if a specific subject exists in the set.
// Create a map of students and their grades, update a grade, remove a student, and print the map.
import java.util.ArrayList;

public class Assignment2 {
    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<>();
        Students.add("manoj");
        Students.add("vickas");
        Students.add("rakesh");
        Students.add("sanju");
        Students.add("lokesh");
        System.out.println(Students);

        // adding a another name at the position of 2;
        Students.add(1, "pranesh");
        System.out.println(Students);
        // removing an elemnt from the list;
        Students.remove(3);
        System.out.println(Students);
    }

}