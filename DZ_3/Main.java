package DZ_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Q", 20, "Chemical", 5);
        Student1 s2 = new Student1("A", 22, "Chemical", 4);
        Student1 s3 = new Student1("S", 13, "Chemical", 3);
        Student1 s4 = new Student1("X", 21, "Chemical", 2);

        ArrayList<Student1> students = new ArrayList<>(List.of(s1, s2, s3, s4));
        
        Group group = new Group(students);
        Group group2 = new Group(students);
        Group group3 = new Group(students);
        Group group4 = new Group(students);
        Group group5 = new Group(students);

        Stream stream1 = new Stream(new ArrayList<>(List.of(group, group2, group3)));
        Stream stream2 = new Stream(new ArrayList<>(List.of(group, group2, group3, group4, group5)));
        System.out.println(stream2.compareTo(stream1));
        for (Student1 student : group) {
            // System.out.println(student.compareTo(s1));
            System.out.println(student);
        }

    }
}
