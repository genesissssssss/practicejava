
import java.util.Scanner;
public class UsernameAnalyzer {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.print("What is your username?: ");
        name = scanner.nextLine();
        int length = name.length();
        String nameLower = name.toLowerCase();
        String nameUpper = name.toUpperCase();
        char firstChar= name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);


        System.out.println("Your username is: " + name);
        System.out.println("Length: " + length);
        System.out.println("All UPPER: " + nameUpper);
        System.out.println("all lower: "+ nameLower);
        System.out.println("First Char: "+ firstChar);
        System.out.println("Last Char: "+ lastChar);



        scanner.close();
    }

}
