package DZ_5.Viev;

import java.util.ArrayList;

import DZ_5.Data.Student;

public class StudentViev {
    private ArrayList<Student> students;

    public StudentViev(ArrayList<Student> students){
        this.students = students;
    }
    
    public void showStudent(int id){
        for (int i = 0; i < students.size(); i++){
            if(students.get(i).getId()== id){
                System.out.println(students.get(i));
            }
        }
    }
}
