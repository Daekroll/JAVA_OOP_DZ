package DZ_5;

import java.util.List;

import DZ_5.Data.Student;
import DZ_5.Data.Teacher;
import DZ_5.Service.DataService;




public class Main {
    public static void main(String[] args) {
        DataService data = new DataService();

        data.create(new Student("A", 15));
        data.create(new Student("B", 15));
        data.create(new Student("C", 15));
        data.create(new Teacher("Teach1", 32, List.of("math")));
        data.create(new Teacher("Teach2", 43, List.of("math", "phisics")));
        data.create(new Teacher("Teach1", 32, List.of("math", "phisics", "astronomy")));
        data.create(new Teacher("Teach3", 32, List.of("informatics", "astronomy")));

        data.read(true);
        System.out.println();
        data.read(false);
        data.show(2);
    }
}
