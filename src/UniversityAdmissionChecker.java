import java.util.Scanner;
public class UniversityAdmissionChecker {

    public static void main (String[] args) {

        int age;
        double grade;
        boolean hasDocuments;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        age = scanner.nextInt();
        System.out.print("Enter grade: ");
        grade = scanner.nextDouble();
        System.out.print("Do you have a documents? (true/false): ");
        hasDocuments = scanner.nextBoolean();

        if (age >= 18 && grade >= 75 && hasDocuments) {
            System.out.println("Congrats on your admission! ");
        }
        else if (age >= 18 && grade >= 75 && !hasDocuments){
        System.out.println(" Incomplete Documents");
        }
        else if (age <= 17 || age < 0 ){
            System.out.println("Your still underage ");
        }
        else if (grade <= 74 || grade < 0 ) {
            System.out.println(" Your grades did not meet the requirements ");
        }



        scanner.close();

    }
}
