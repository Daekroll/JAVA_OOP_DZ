package DZ_3;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String specialization;
    private Integer grade;

    public Student(String name, int age, String specialization, int grade) {
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.grade = grade;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getSpecialization() {
        return specialization;
    }
    public int getGrade() {
        return grade;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public int compareTo(Student student) {
        String s1 = this.name + this.grade;
        String s2 = student.name + student.grade;
        return s1.compareTo(s2);
    }
    @Override
    public String toString() {
        return String.format("Имя %s", this.name);
    }
}
