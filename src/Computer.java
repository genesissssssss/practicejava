public class Computer {

    private RAM ram;
    private CPU cpu;
    private Storage storage;

    Computer(){
        cpu = new CPU("Ryzen", 2.8);
        ram = new RAM(16,"DDR4");
        storage = new Storage(256, "SDD");
    }

    public void displayComputerInfo(){

        System.out.println("Computer Specification");
        System.out.println();

        ram.displayInfo();
        System.out.println();

        cpu.displayInfo();
        System.out.println();

        storage.displayInfo();
        System.out.println();

    }
}
