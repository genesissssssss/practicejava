public class Students{

    private String studentName;
    private String gradeLevel;

    public Students (String studentName, String gradeLevel, String){
        this.studentName = studentName;
        this.gradeLevel = gradeLevel;
    }


    public void displayInfo(){
        System.out.println("Student Name: " + studentName + " |Year Level: " + gradeLevel);
    }
}
