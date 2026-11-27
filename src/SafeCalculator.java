
import java.util.Scanner;

public class SafeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            String firstInput = input.nextLine();

            double num1 = Double.parseDouble(firstInput);

            System.out.print("Enter operator (+, -, *, /): ");
            String operator = input.nextLine();

            System.out.print("Enter second number: ");
            String secondInput = input.nextLine();

            double num2 = Double.parseDouble(secondInput);

            double result = 0;

            switch (operator) {

                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "/":

                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }

                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Invalid operator.");
                    return;
            }

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {

            System.out.println("Error: Please enter valid numbers.");

        } catch (ArithmeticException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            input.close();

        }
    }
}
