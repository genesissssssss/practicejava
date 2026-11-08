public class CashPayment extends payment{
    @Override
    public void pay(double amount) {
        System.out.printf("Paid ₱%,.2f in Cash. Tendered exact amount or change received.%n", amount);
    }
}
