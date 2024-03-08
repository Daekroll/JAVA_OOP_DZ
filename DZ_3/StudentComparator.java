package DZ_3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student1>{
    
    @Override
    public int compare(Student1 s1, Student1 s2) {
        String student1 = s2.getName() + s2.getGrade();
        String student2 = s1.getName() + s1.getGrade(); 
        return student1.compareTo(student2);
    }
}
