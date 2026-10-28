public class Person_Student_Main {

    public static void main(String[] args){

        Person person = new Person("Genesis ", 24);
        Student student = new Student(101, "Bautista", 24, "BSIS", 2.0);

        person.showPerson();

        student.showStudents();


    }
}
