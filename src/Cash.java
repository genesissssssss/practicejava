public class Cash extends Payments{

    @Override
    void processPayment(){
        System.out.println("You paid using cash!");
    }
}
