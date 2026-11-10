public class Payment_Processor {

    public static void main(String[] args){

        Gcash gcash = new Gcash();
        CreditCard card = new CreditCard();
        Cash cash = new Cash();

        Payments[] payments = {gcash, card, cash};

        for (Payments payment : payments){
            payment.processPayment();
        }
    }
}
