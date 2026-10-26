public class StudentCounter_Main {

    public static void main(String[] args) {

        StudentCounter student1 = new StudentCounter(1, "MARC");
        StudentCounter student2 = new StudentCounter(2, "Genesis");
        StudentCounter student3 = new StudentCounter(3, "Bautista");
        StudentCounter student4 = new StudentCounter(4, "MARC");

        StudentCounter.showNumOfStudents();
    }
}
