public class Teacher extends Person {
    private String profession;
    private final String[] options = {"Math", "Chemistry", " Geography", "Literature", "Physics", "Sports"};

    public Teacher(String name, int age, String profession) {
        super(name, age);
        setProfession(profession);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return super.toString() + getProfession();
    }
}
