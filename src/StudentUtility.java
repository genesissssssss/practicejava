import java.util.Scanner;
public class StudentUtility {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        double grade1;
        double grade2;
        double grade3;

        System.out.print("Enter Student name: ");
        name = scanner.nextLine();

        System.out.print("Enter Grade 1: ");
        grade1 = scanner.nextDouble();

        System.out.print("Enter Grade 2: ");
        grade2 = scanner.nextDouble();

        System.out.print("Enter Grade 3: ");
        grade3 = scanner.nextDouble();



        double avg = calculateAverage(grade1, grade2, grade3);
        boolean passed = isPassed(avg);
        displayStudent(name, avg, passed);

        scanner.close();
    }

    public static double calculateAverage(double grade1, double grade2, double grade3){
        return (grade1 + grade2 + grade3) / 3.0;
    }

    public  static boolean isPassed(double average){
        return average >= 75.0;
    }

    public static void displayStudent(String name, double average, boolean passed){
        System.out.println(" \n---Student Report Card---");
        System.out.println("Student Name: " + name);
        System.out.printf("Final Average: %.2f%n", average);

        if (passed){
            System.out.println("Status:          PASSED");
        }else {
            System.out.println("Status:          FAILED");
        }
    }
}
