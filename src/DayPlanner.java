import java.util.Scanner;
public class DayPlanner {

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Day Planner

        String day;

        System.out.print("Enter a number: ");
        day = scanner.nextLine();

        switch (day){
            case "1" -> System.out.println("Monday: Chest Day");
            case "2" -> System.out.println("Tuesday: Shoulder Day");
            case "3" -> System.out.println("Wednesday: legs Day");
            case "4" -> System.out.println("Thursday: rest Day");
            case "5" -> System.out.println("Friday: upper Day");
            case "6" -> System.out.println("Saturday: lower Day");
            case "7" -> System.out.println("Sunday: rest Day");
            default -> System.out.println("not in planner");
        }


        scanner.close();
    }

}
