// Create a set of 5 subjects, add a duplicate, and check if a specific subject exists in the set.

import java.util.Set;
import java.util.HashSet;

public class task2 {
    public static void main(String[] args) {
        Set<String> subject = new HashSet<>();
        subject.add("kannada");
        subject.add("science");
        subject.add("social");
        subject.add("english");
        subject.add("Math");

        System.out.println(subject);

        // adding a duplictae subject;
        subject.add("math");
        // check if a specific subject exists in the set.
        System.out.println(subject.contains("hindi"));
    }
}
