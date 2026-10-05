import java.util.Scanner;

public class EnterNames {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String [] studentName = new String[3];

        for (int i = 0; i < studentName.length; i++){
            System.out.print("Enter Student name: ");
            studentName[i] = scanner.nextLine();
        }

        for (String name : studentName){
            System.out.println(name);
        }

        scanner.close();

    }

    
}
