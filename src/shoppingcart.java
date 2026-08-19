import java.util.Scanner;
public class shoppingcart {
    public static void main() {

        String item1;
        String item2;
        String item3;
        int quantity;
        char symbol = '$';
        double price;
        double subtotal = 0;
        double tax = 0.12;
        double total;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first Item: ");
        item1 = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        quantity = scanner.nextInt();
        System.out.print("Enter the price: ");
        price = scanner.nextDouble();

        scanner.nextLine();
        subtotal += (price * quantity);

        //2
        System.out.print("Enter your Second Item: ");
        item2 = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        quantity = scanner.nextInt();
        System.out.print("Enter the price: ");
        price = scanner.nextDouble();

        scanner.nextLine();
        subtotal += (price * quantity);

        //3
        System.out.print("Enter your third Item: ");
        item3 = scanner.nextLine();
        System.out.print("Enter the quantity: ");
        quantity = scanner.nextInt();
        System.out.print("Enter the price: ");
        price = scanner.nextDouble();

        scanner.nextLine();
        subtotal += (price * quantity);

        double taxamount = subtotal * tax;
        total = subtotal + taxamount;

        System.out.println("You have bought " + item1 +  ", " + item2 + ", " + item3);

        System.out.println("Subtotal:   "+symbol+ subtotal);
        System.out.println("Tax (12%):  "+ symbol+ taxamount);
        System.out.println("Total:      "+ symbol+ total);






        scanner.close();
    }
}
