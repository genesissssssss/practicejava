import java.util.ArrayList;
import java.util.List;

public class EmployeeList_Main {
    public static void main(String[] args){

        List <EmployeeList> employees =  new ArrayList<>();
        employees.add(new EmployeeList(1, "Marc Genesis Abilar", "developer", 22000));
        employees.add(new EmployeeList(2, "Marc Abilar", "programmer1", 22000));
        employees.add(new EmployeeList(3, "Genesis Abilar", "programmer2", 28000));
        employees.add(new EmployeeList(4, "Maki Abilar", "Sr.developer", 42000));
        employees.add(new EmployeeList(5, "Marc Genesis Maki", "QA", 22000));

        System.out.println("--- Employee List ---");
        for (EmployeeList emp : employees){
            System.out.println(emp);
        }
;
        EmployeeList highestPaid = employees.get(0);

        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(i).salary > highestPaid.salary) {
                highestPaid = employees.get(i);
            }
        }


        System.out.println("\n--- Highest Paid Employee ---");
        System.out.println("Highest Salary: " + highestPaid.employeeName + " earns $" + highestPaid.salary);
    }
}








