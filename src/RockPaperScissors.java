import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            System.out.print("Enter your choices(rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){

                System.out.println("Invalid");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choices: "+ computerChoice);

            if (playerChoice.equals(computerChoice)){
                System.out.println("It's Tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))){

                System.out.println("You Win!");
            }else{
                System.out.println("You Lose!");
            }

            System.out.print("Do you want to play again?(yes/no): ");
            playAgain = scanner.next().toLowerCase();

        }while (playAgain.equals("yes"));
        System.out.println("Goodbye!");
    }
}
