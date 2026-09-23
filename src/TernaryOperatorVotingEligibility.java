import java.util.Scanner;
public class TernaryOperatorVotingEligibility {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("What is your age: ");
        age = scanner.nextInt();
        boolean legalAge = (age >= 18) ? true : false;

        if(legalAge == true){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("not eligible to vote");
        }



        scanner.close();



    }
}
