import java.util.Scanner;
public class emailExtractor {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String username;
        String email;
        String domain;



        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: "+ domain);

        }else {
            System.out.println("Invalid email");
        }




        scanner.close();

    }
}
