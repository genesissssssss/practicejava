public class Bank_Account_Details {

    private String accountNumber;
    private double balance;

    Bank_Account_Details(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Getters
    String getAccountNumber(){
        return this.accountNumber;
    }

    double getBalance(){
        return this.balance;
    }

    //setters
    void setBalance(double balance){
        this.balance = balance;
    }



}
