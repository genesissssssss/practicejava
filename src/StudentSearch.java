
import java.util.Scanner;


public class StudentSearch {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] studentName = {"Marc", "Genesis", "Bautista"};
        boolean isFound = false;

        System.out.print("Enter Student Name: ");
        String searcName = scanner.nextLine();


        for (int i = 0; i < studentName.length; i++){
            if (studentName[i].equals(searcName)){
                isFound = true;
                break;
            }

        }
        if (isFound){
            System.out.println("Student found!");
        }else {
            System.out.println("Student not found!");
        }


    }
}
