import java.util.Arrays;

public class Student extends Person {
    private Grade[] grades;

    public Student(String name, int age, Grade[] grades) {
        super(name, age);
        this.grades = grades;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    public void addGrade(Grade grade) {
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != null) {
                if (grades[i].getProfession().equals(grade.getProfession())) {
                    grades[i] = grade;
                    break;
                }
            } else {
                grades[i] = grade;
                break;
            }
        }
    }

    public double studentAvg () {
        int avg = 0;
        for (int i = 0; i < 6; i++) {
            avg = avg + getGrades()[i].getScore();
        }
        return (double)avg/6;
    }

    @Override
    public String toString() {
        return super.toString() + Arrays.toString(getGrades());
    }
}
