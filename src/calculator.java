import java.util.Scanner;

public class calculator {
    public static void main() {
        double num1;
        char operator;
        double num2;
        String choice;
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning){
            System.out.print("Enter your first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter your operator: ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter your Second number: ");
            num2 = scanner.nextDouble();

            boolean isValidOperaion = true;
            double result =0;

            if (operator == '+'){
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {

                if (num2 == 0){
                    System.out.println("error: cannot divide by zero");
                    isValidOperaion = false;
                }else {
                    result = num1 / num2;
                }
            }else{
                System.out.println("error: invalid operator.");
                isValidOperaion = false;
            }
            if (isValidOperaion){
                System.out.println("Result: " + result);
            }
            System.out.print("Do you want to calculate again? (yes/no): ");
            choice = scanner.next();

            if (choice.equalsIgnoreCase("no")){
                isRunning = false;
                System.out.println("Bye!");
            }



        }


        scanner.close();
    }
}
