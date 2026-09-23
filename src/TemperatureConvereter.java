import java.util.Scanner;
public class TemperatureConvereter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Conver to Celcius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32 ) * 9 / 5 : (temp * 9 / 5 ) + 32;

        System.out.printf("%.2f%s",newTemp, unit);


        scanner.close();

    }
}
