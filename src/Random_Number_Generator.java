import java.util.Random;

public class Random_Number_Generator {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Generating 10 random numbers:");

        //run a loop exactly 10 times
        for (int i = 0; i < 10; i++) {
            // Generates a number from 0 to 99, then adds 1 to make it 1 to 100
            int randomNumber = random.nextInt(100) + 1;

            System.out.println("Number " + (i + 1) + ": " + randomNumber);
        }
    }
}
