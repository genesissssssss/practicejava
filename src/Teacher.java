public class Teacher{

    private String teachersName;
    private String courses;

    public Teacher(String teachersName, String courses){
        this.teachersName = teachersName;
        this.courses = courses;
    }


    public void displayInfo(){
        System.out.println("Teachers Name: " + teachersName + " |Subject: " + courses);
    }


}
