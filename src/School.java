import java.util.Arrays;

public class School {
    private ClassRoom[] classRooms;

    public School(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    @Override
    public String toString() {
        return Arrays.toString(classRooms);
    }
}
