package DZ_3;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<Student1> {
    private List<Student1> students;
    private int count;
    public GroupIterator(List<Student1> students){
        this.students = students;
    }
    @Override
    public boolean hasNext(){
        return count < students.size();
    }
    @Override
    public Student1 next(){
        return students.get(count++);
    }
}
