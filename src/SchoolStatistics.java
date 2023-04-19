public class SchoolStatistics {
    public static void main(String[] args) {
        final String[] options = {"Math", "Chemistry", "Geography", "Literature", "Physics", "Sports"};
        ClassRoom[] classRooms = new ClassRoom[5];
        for (int i = 0; i < 5; i++) {
            Teacher teacher = new Teacher("Teacher" + (i + 1), (int) (Math.random() * 100 + 20), options[(int) (Math.random() * 6)]);
            Student[] students = new Student[15];
            for (int j = 0; j < 15; j++) {
                Grade[] grades = new Grade[6];
                for (int k = 0; k < 6; k++) {
                    grades[k] = new Grade(options[k], (int) (Math.random() * 61 + 40));
                }
                students[j] = new Student("Student" + (j + 1), (int) (Math.random() * 101 + 20), grades);
            }
            classRooms[i] = new ClassRoom("ClassRoom" + (i + 1), teacher, students);
        }
        School school = new School(classRooms);

        //סעיף 5.1 ממוצע בית ספרי כולל
        double avg = 0;
        for (ClassRoom cR : school.getClassRooms()) {
            avg = avg + cR.classAvg();
        }
        System.out.println("School Average: " + avg / 5);

        //סעיף 5.2 - ממוצע ציוני כיתתי
        for (ClassRoom cR : school.getClassRooms()) {
            System.out.println(cR.getName() + " Average: " + cR.classAvg());
        }

        // סעיף 5.3 - ממוצע בית ספרי עבור כל מקצוע
        int math = 0, chemistry = 0, geography = 0, literature = 0, physics = 0, sports = 0;
        for (ClassRoom cR : school.getClassRooms()) {
            for (Student s : cR.getStudents()) {
                for (Grade grade : s.getGrades()) {
                    switch (grade.getProfession()) {
                        case "Math": {
                            math = math + grade.getScore();
                            break;
                        }
                        case "Chemistry": {
                            chemistry = chemistry + grade.getScore();
                            break;
                        }
                        case "Geography": {
                            geography = geography + grade.getScore();
                            break;
                        }
                        case "Literature": {
                            literature = literature + grade.getScore();
                            break;
                        }
                        case "Physics": {
                            physics = physics + grade.getScore();
                            break;
                        }
                        case "Sports": {
                            sports = sports + grade.getScore();
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Math: " + (double) math / 75 +
                "\nChemistry: " + (double) chemistry / 75 +
                "\nGeography: " + (double) geography / 75 +
                "\nLiterature: " + (double) literature / 75 +
                "\nPhysics: " + (double) physics / 75 +
                "\nSports: " + (double) sports / 75);

        //סעיף 6.1 - מספר התלמידים בגילאים 20-30 וממוצע הציונים שלהם
        int count = 0;
        avg = 0;
        for (ClassRoom cR : school.getClassRooms()) {
            for (Student s : cR.getStudents()) {
                if (s.getAge() <= 30) {
                    count++;
                    avg = avg + s.studentAvg();
                }
            }
        }
        System.out.println("The number of students between the age of 20-30 is: " + count +
                "\nTheir average is: " + avg / count);

        //סעיף בונוס 6.3 - ממוצע הגילאים של כלל התלמידים
        int ageAvg = 0;
        for (ClassRoom cR : school.getClassRooms()) {
            for (Student s : cR.getStudents()) {
                ageAvg = ageAvg + s.getAge();
            }
        }
        System.out.println("Students Average Age: " + (double) ageAvg / 75);
    }
}