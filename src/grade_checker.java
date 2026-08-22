
import java.util.Scanner;
public class grade_checker {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
        boolean isStudent;
        int grade;
        String name;

        System.out.println("Are you a Student? (true/false): ");
        isStudent = scanner.nextBoolean();
        scanner.nextLine();

        if(isStudent){
            System.out.println("Welcome student!");
        }else{
            System.out.println("your not a Student!");
        }


        System.out.print("name: ");
        name = scanner.nextLine();

        System.out.print("Grade: ");
        grade = scanner.nextInt();


        if(grade >=90){
            System.out.println("Excellent");
        }else if(grade >= 80){
            System.out.println("Very good");
        } else if (grade >= 75) {
            System.out.println("Passed");
        }else  {
            System.out.println("failed");
        }


        scanner.close();
    }

}
