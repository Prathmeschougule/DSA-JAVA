package oop.collectionFremwork.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortObjectExample {
    public static void main(String[] args) {

        List<Student>  students = new ArrayList<>();
        students.add(new Student("Prathmesh", 85));
        students.add(new Student("Nilesh", 90));
        students.add(new Student("Pushpa", 80));
        Collections.sort(students);
        System.out.println("Sorted by marks: " + students);
    }
}
