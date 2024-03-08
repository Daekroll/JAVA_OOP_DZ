package DZ_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Iterable<Student1> {
    private ArrayList<Student1> students;

    public Group(ArrayList<Student1> students){
        this.students = students;
    }
    public ArrayList<Student1> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Student1> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student1> iterator(){
        return new GroupIterator(students);
    }
}
