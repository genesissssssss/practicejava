public class GcashPayment extends payment{

    private String phoneNumber;

    public GcashPayment(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    void pay(double amount){
        System.out.printf("Paid ₱%,.2f using Gcash (Account: %s).%n", amount, phoneNumber);
    }

}
