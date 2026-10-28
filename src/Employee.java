public class Employee {

        private String name;
        private int id;
        private double salary;
        private boolean isActive;

        public Employee(int id, String name, double salary, boolean isActive){

            this.id = id;
            this.name = name;
            this.salary = salary;
            this.isActive = isActive;
        }

    public String getActiveStatus(){
        return isActive ? "Active" : "Not Active";
    }

    public void work(){
        System.out.println(getName() + " is fulfilling general employee duties. ");
    }

        public void displayDetails(){
            System.out.println("Id: " + id + " | Name: " +  name + " | Salary: $" + salary + "| Status: " + getActiveStatus());
        }

        public String getName() {return name;}
        public int getId() {return id;}
        public double getSalary() {return salary;}
        public boolean isActive () {return isActive;}

}
