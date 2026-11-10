public class CreditCard extends Payments {

    @Override
    void processPayment(){
        System.out.println("You paid using credit card!");
    }
}
