import java.util.ArrayList;

public class School {

    private String schoolName;

    private ArrayList<Teacher> teachers;
    private ArrayList<Students> students;

    public School(String schoolName){
        this.schoolName = schoolName;

        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addStudents(Students student){
        students.add(student);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void displaySchoolInfo(){
        System.out.println("------SCHOOL INFORMATION------");
        System.out.println("\nSchool: " + schoolName);

        System.out.println("\n--- Teachers ---");

        for (Teacher teacher : teachers){
            teacher.displayInfo();
            System.out.println();
        }

        System.out.println("\n--- Students ---");
        for (Students student : students){
            student.displayInfo();
            System.out.println();
        }
    }



    }
