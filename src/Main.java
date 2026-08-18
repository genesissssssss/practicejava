import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        String name;
        int age ;
        int year;
        double average;
        boolean status;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        name = scanner.nextLine();
        System.out.print("age: ");
        age = scanner.nextInt();
        System.out.print("year: ");
        year = scanner.nextInt();
        System.out.print("average: ");
        average = scanner.nextDouble();
        System.out.print("are you enrolled (True/False):  ");
        status = scanner.nextBoolean();

        System.out.println("your name is " +  name);
        System.out.println("your age is " + age);
        System.out.println("you are in " + year + "th year");
        System.out.println("average is " + average);


        if(average > 75){
            System.out.println("You passed");
        }else{
            System.out.println("You failed");
        }

        if(status){
            System.out.println("You are enrolled");
        }else{
            System.out.println("You are not enrolled");
        }




        scanner.close();
    }
}
