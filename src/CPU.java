public class CPU {

    private String brand;
    private double speed;

    public CPU(String brand, double speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo(){
        System.out.println("CPU Brand: " + brand);
        System.out.println("CPU Speed: " + speed + "Ghz");
    }
}
