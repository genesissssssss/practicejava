public class Getters_And_Setters {
    public static void main(String[] args){

        Bank_Account_Details account = new Bank_Account_Details("5446512104", 60000);

        account.setBalance(20000);

        System.out.println("--------Account Details--------");
        System.out.println("Account Number: "+ account.getAccountNumber() + "\n" + "Account Balance: " + account.getBalance());

    }
}
