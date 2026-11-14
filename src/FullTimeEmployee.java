public class FullTimeEmployee extends  Employeee{


    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary){
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
