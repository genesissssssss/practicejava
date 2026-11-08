public class Payment_System {
    public static void main(String[] args){

        payment gcash = new GcashPayment("097518045188");
        payment card = new CardPayment("65895454751", "Master Card");
        payment cash = new CashPayment();

        System.out.println("-----Processing Transaction-----");
        gcash.pay(500);
        card.pay(1080.50);
        cash.pay(550);


    }
}
