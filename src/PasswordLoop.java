import java.util.Scanner;
public class PasswordLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String correctPassword = "Genesis12";
        String inputPassword = "";


        do{
            System.out.print("Enter password: ");
            inputPassword = scanner.nextLine();

            if(!inputPassword.equals(correctPassword)){
                System.out.println("Wrong Password");
            }
        }
        while(!inputPassword.equals(correctPassword));
        System.out.println("Welcome!");

        
        scanner.close();

    }
}