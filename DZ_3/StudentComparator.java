package DZ_3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
    
    @Override
    public int compare(Student s1, Student s2) {
        String student1 = s2.getName() + s2.getGrade();
        String student2 = s1.getName() + s1.getGrade(); 
        return student1.compareTo(student2);
    }
}
