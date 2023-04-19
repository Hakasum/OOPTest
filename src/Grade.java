public class Grade {
    private String profession;
    private int score;

    public Grade(String profession, int score) {
        setProfession(profession);
        setScore(score);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score >=40 && score <= 100)
            this.score = score;
        else System.out.println("Invalid Score");
    }

    @Override
    public String toString() {
        return profession + ": " + score;
    }
}
