public class CardPayment extends payment{

    private String cardNumber;
    private String cardType;

    public CardPayment(String cardNumber, String cardType){
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    @Override
    public void pay(double amount){
        String maskedCard = "****" + cardNumber.substring(cardNumber.length() - 4);
        System.out.printf("Paid ₱%,.2f using %s (%s).%n", amount, cardType, maskedCard);
    }
}
