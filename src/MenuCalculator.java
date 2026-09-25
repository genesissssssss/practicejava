import java.util.Scanner;

public class MenuCalculator {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        boolean isRunning = true;

        while (isRunning) {
            double num1;
            double num2;
            char operator;
            double result = 0;
            boolean validOperator = true;

            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+' -> result = num1 + num2;
                case '-' -> result = num1 - num2;
                case '*' -> result = num1 * num2;
                case '/' -> {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero! ");
                        validOperator = false;
                    } else {
                        result = num1 / num2;
                    }
                }
                default -> {
                    System.out.println("Invalid Operator! ");
                    validOperator = false;
                }
            }
            if(validOperator){
                System.out.println(result);
            }

            System.out.print("Do you want to continue?(y/n): ");
            String choice = scanner.next();


            if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("exit")){
                isRunning = false;
            }

        }

        System.out.println("Goodbye");


        scanner.close();
    }
}
