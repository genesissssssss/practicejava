public class Student extends Person{

    int id;
    String course;
    double gwa;

    Student(int id, String name, int age, String course, double gwa){
        super(name, age);
        this.id = id;
        this.course = course;
        this.gwa = gwa;

    }

    void showStudents(){
        System.out.println("ID: " + id + "| Name: " + getName() + "| Age: " + getAge() + "| Course: " + course + "| GWA: " + gwa);

    }


}
