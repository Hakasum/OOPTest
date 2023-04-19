import java.util.Arrays;

public class ClassRoom {
    private String name;
    private Teacher teacher;
    private Student[] students;

    public ClassRoom(String name, Teacher teacher, Student[] students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public double classAvg () {
        double avg = 0;
        for (int i = 0; i < 15; i++) {
            avg = avg + getStudents()[i].studentAvg();
        }
        return avg/15;
    }

    @Override
    public String toString() {
        return getName() + ": " +
               "\n" +getTeacher().toString()+
                "\n"+ Arrays.toString(students);
    }
}
