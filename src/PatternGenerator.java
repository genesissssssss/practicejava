import java.util.Scanner;

public class PatternGenerator {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pattern Generator");

        System.out.print("Enter a Symbol: ");
        char symbol = scanner.next().charAt(0);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        for (int i = 0; i < rows; i++){

            for (int j = 0; j <= i; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
