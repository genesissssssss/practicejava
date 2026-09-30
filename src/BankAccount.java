import java.util.Scanner;

public class BankAccount {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 50;
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Bank account");
            System.out.println("1. Show Balance ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance - withdraw(balance);
                case 3 -> balance = balance + deposit();
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice!");
            }


        }
        System.out.println("Bye!");
    }

        static void showBalance(double balance){
            System.out.println("\nBALANCE");
            System.out.printf("$%.2f\n", balance);
            System.out.println();
        }

        static double deposit(){

        double amount;

            System.out.println();
            System.out.print("Enter an amount: ");
            amount = scanner.nextDouble();

            if (amount <= 0){
                System.out.println("amount cant be zero ");
                return 0;
            }else {
                return amount;
            }
        }

        static double withdraw(double balance){
        double amount;

            System.out.println();
            System.out.println("WITHDRAW\n");
            System.out.print("Enter amount: ");
            amount = scanner.nextDouble();

            if(amount > balance){
                System.out.println("Insufficient balance!");
                return 0;
            } else if (amount <= 100) {
                System.out.println("100 is the minimum amount for withdrawal! ");
                return 0;
            }else {
                return amount;
            }

        }





}
