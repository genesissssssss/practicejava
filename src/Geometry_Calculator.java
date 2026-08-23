import java.util.Scanner;
public class Geometry_Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        double squareArea = side * side;
        double squarePerimeter = 4 * side;

        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " +squarePerimeter);
        System.out.println();

        System.out.print("Enter rectangle length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter rectangle width: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("The rectangle area: " + area);
        System.out.println("The rectangle perimeter:" + perimeter);



        scanner.close();


    }
}
