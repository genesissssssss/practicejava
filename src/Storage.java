public class Storage {

    private int capacity;
    private String type;

    public Storage(int capacity, String type){
        this.capacity = capacity;
        this.type = type;
    }

    public void displayInfo(){
        System.out.println("Storage Capacity: " + capacity +"GB");
        System.out.println("Storage Type: " + type);
    }
}
