public class ContractEmployee extends Employeee {

    double contractRate;
    int monthsWorked;

    ContractEmployee(String name, double contractRate, int monthsWorked){

        super(name);
        this.contractRate = contractRate;
        this.monthsWorked = monthsWorked;

    }


    @Override
    public double calculateSalary(){
        return contractRate * monthsWorked;
    }
}
