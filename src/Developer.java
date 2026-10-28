public class Developer extends Employee{
    private String versionControlSystem;

    public Developer(int id, String name, double salary, boolean isActive, String versionControlSystem){
        super(id, name, salary, isActive);
        this.versionControlSystem = versionControlSystem;
    }
    public void writeCode(){
        System.out.println(getName() + " is writing code");
    }

    @Override
    public void work(){
        System.out.println(getName() + " is busy debugging ");
    }


}
