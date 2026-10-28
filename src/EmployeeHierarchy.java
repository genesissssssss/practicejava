public class EmployeeHierarchy {
    public static void main(String[] args){

        System.out.println("---------Employee Instance---------");
        Employee emp = new Employee(101, "Marc", 20000, false);
        emp.displayDetails();
        emp.work();

        System.out.println("\n---------Developer Instance---------");
        Developer dev = new Developer(102, "Genesis", 25000, true, "gitlab");
        dev.displayDetails();
        dev.work();
        dev.writeCode();

        System.out.println("\n---------Java Developer Instance---------");
        JavaDeveloper javDev = new JavaDeveloper(103, "Bautista", 30000, true, "Github", "SpringBoot" );
        javDev.displayDetails();
        javDev.work();
        javDev.compileJava();
        javDev.writeCode();
    }
}
