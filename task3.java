
// Create a map of students and their grades, update a grade, remove a student, and print the map.
import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        Map<String, Integer> Grades = new HashMap<>();
        Grades.put("manoj", 75);
        Grades.put("charan", 95);
        Grades.put("sharath", 85);
        Grades.put("sager", 65);
        Grades.put("veeresh", 55);
        System.out.println(Grades);

        // update or changing the charan grade ;
        Grades.put("charan", 45);
        System.out.println(Grades);
        // remove a student, and print the map;
        Grades.remove("sager");
        System.out.println(Grades);
    }

}
