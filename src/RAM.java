public class RAM {

    private int capacity;
    private String type;

    public RAM(int capacity, String type){
        this.capacity = capacity;
        this.type = type;
    }

    public void displayInfo(){
        System.out.println("RAM Capacity: " + capacity +"GB");
        System.out.println("RAM Type: " + type);
    }
}
