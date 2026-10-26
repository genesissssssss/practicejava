public class StudentCounter {


    static int numOfStudents;
    String studentsName;
    int id;

    StudentCounter( int id, String studentsName){
        this.id = id;
        this.studentsName = studentsName;
        numOfStudents++;
    }

    static void showNumOfStudents(){
        System.out.println("Total Student: " + numOfStudents);
    }


}
