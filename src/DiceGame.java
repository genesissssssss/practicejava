import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String choice;


        System.out.println("DICE GAME\n");

        do {
            int playerDice = random.nextInt(6) + 1;
            int computerDice = random.nextInt(6) + 1;

            System.out.println("Player Dice: " + playerDice);
            printdice(playerDice);
            System.out.println("Computer Dice: " + computerDice);
            printdice(computerDice);

            if (playerDice > computerDice) {
                System.out.println("Player Wins!");
            } else if (computerDice > playerDice) {
                System.out.println("Computer Wins!");
            } else {
                System.out.println("It's a Tie!");
            }

            System.out.print("\nDo you want to roll again? (yes/no): ");
            choice = scanner.nextLine();

        }while (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"));

        System.out.println("\nThanks for playing! Goodbye.");




        scanner.close();
    }

    static void printdice(int dice){

        String dice1 = """
                   ---------
                  |         |
                  |    ●    |
                  |         |
                   ---------
                """;

        String dice2 = """
                   ---------
                  |         |
                  | ●     ● |
                  |         |
                   ---------
                """;
        String dice3 = """
                   ---------
                  |       ● |
                  |    ●    |
                  | ●       |
                   ---------
                """;
        String dice4 = """
                   ---------
                  |  ●   ●  |
                  |         |
                  |  ●   ●  |
                   ---------
                """;
        String dice5 = """
                   ---------
                  | ●     ● |
                  |    ●    |
                  | ●     ● |
                   ---------
                """;
        String dice6 = """
                   ---------
                  | ●     ● |
                  | ●     ● |
                  | ●     ● |
                   ---------
                """;

        switch (dice){

            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }

    }

}
