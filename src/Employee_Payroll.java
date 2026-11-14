public class Employee_Payroll {
    public static void main(String[] args){

        Employeee emp1 = new FullTimeEmployee("marc", 26000);
        Employeee emp2 = new PartTimeEmployee("Gen", 200, 8);
        Employeee emp3 = new ContractEmployee("Maki", 26000, 6);

        Employeee[] employeees = {emp1, emp2, emp3};

        for(Employeee employee : employeees){
            System.out.println("Employee: " + employee.name);
            System.out.println("Salary: " + employee.calculateSalary());
            System.out.println("-------------------");
        }

    }
}
