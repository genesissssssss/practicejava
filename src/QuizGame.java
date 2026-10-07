import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args){
        String [] question = {"1. Which device forwards packets between different networks? ",
        "2. What does SQL primarily interact with? ",
        "3. Which SQL command retrieves data? ",
        "4. What is the primary purpose of a firewall? ",
        "5. Which of the following is an example of cloud computing? "};

        String[][] choices = {
                {"1. Switch", "2. Router", "3. Keyboard", "4. Monitor"},
                {"1. Operating systems", "2. Databases", "3. Web browsers", "4. CPUs"},
                {"1. INSERT", "2. UPDATE", "3. SELECT", "4. DELETE"},
                {"1. Increase monitor resolution", "2. Protect a network/system by controlling traffic", "3. Store database records", "4. Compile source code"},
                {"1. Saving everything only on a local hard drive", "2. Accessing computing resources over the internet", "3. Turning off a computer", "4. Formatting a USB drive"}};

        int[] answers = {2, 2, 3, 2, 2};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("         Quiz Game        ");
        System.out.println("Note: choose the number of the correct answer");
        System.out.println();

        for (int i = 0; i < question.length; i++){
            System.out.println(question[i]);

            for (String choice : choices[i]){
                System.out.println(choice);
            }
            System.out.print("Enter the answer: ");
            guess = scanner.nextInt();


            if(guess == answers[i]){
                System.out.println("Correct!");
                score++;
            }else {
                System.out.println("Wrong");

            }

            System.out.println("Your total score is " + score + " out of " + question.length);
        }

        scanner.close();
    }
}
