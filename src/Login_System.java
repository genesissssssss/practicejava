import java.util.Scanner;
public class Login_System {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String username = "genesis";
        int password = 12345678;
        boolean status = true;

        System.out.print("Enter your username: ");
        String Inputusername = scanner.nextLine();

        System.out.print("Enter your password: ");
        int Inputpassword = scanner.nextInt();



        if(username.equals(Inputusername)){
            if(password == Inputpassword){
                System.out.println("Login Successful");
                System.out.println("Username: " + Inputusername);
                System.out.println("Password: " + Inputpassword);


                if(status){
                    System.out.println("Status: active");
                }else{
                    System.out.println("Status: Not active");
                }
            }else {
                System.out.println("Wrong Password");
            }

        }else {
            System.out.println("Wrong username");
        }



        scanner.close();

    }
}
