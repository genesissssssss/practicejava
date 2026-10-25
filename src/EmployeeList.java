public class EmployeeList {

    int id;
    String employeeName;
    String position;
    double salary;

    EmployeeList(int id, String employeeName, String position, double salary){
        this.id = id;
        this.employeeName = employeeName;
        this.position = position;
        this.salary = salary;

    }

    public String toString() {
        return employeeName + " (" + position + ") - $" + salary;
    }

}
