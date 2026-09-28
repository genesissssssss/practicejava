import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attemps = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number Guessing game");
        System.out.printf("Guess a Random Number %d-%d\n", min, max);

        do{
            System.out.print("Enter a number: ");
            guess = scanner.nextInt();
            attemps++;

            if(guess > randomNumber){
                System.out.println("Too high! Try again");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try Again");
            }
            else {
                System.out.println("Correct");
                System.out.println("Guess Attemps: " + attemps);
            }
        }
        while (guess != randomNumber);



        scanner.close();

    }
}
