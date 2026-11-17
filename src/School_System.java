public class School_System {

    public static void main(String[] args){

        Teacher teacher1 = new Teacher("Mr. Santos", "Java Programming");
        Teacher teacher2 = new Teacher("Ms. Reyes", "Database Management");

        Students student1 = new Students("John", "4th Year");
        Students student2 = new Students("Mark", "3rd Year");

        School school = new School("RichWell Colleges");

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);

        school.addStudents(student1);
        school.addStudents(student2);

        school.displaySchoolInfo();

        // Remove a teacher
        System.out.println("----- AFTER REMOVING TEACHER ------");

        school.removeTeacher(teacher1);

        school.displaySchoolInfo();


        System.out.println("----- INDEPENDENT TEACHER OBJECT -----");

        teacher1.displayInfo();

    }
}
