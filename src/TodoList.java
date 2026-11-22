import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> tasks = new ArrayList<>();

        boolean running = true;

        while (running) {

            System.out.println("\n===== TODO LIST =====\n");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. View tasks");
            System.out.println("4. Exit");

            System.out.print("\nChoose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter task: ");
                    String task = input.nextLine();

                    tasks.add(task);

                    System.out.println("Task added successfully!");

                    break;

                case 2:

                    if(tasks.isEmpty()){
                        System.out.println("No task to remove! ");
                        break;
                    }
                    System.out.println("\n------ Your Tasks ------");

                    for(int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }

                        System.out.print("Enter task number to remove: ");
                        int taskNumber = input.nextInt();

                        if(taskNumber >=1 && taskNumber <= tasks.size()){

                            String removeTask = tasks.remove(taskNumber - 1);
                            System.out.println(removeTask + "removed successfully! ");

                        }else{
                            System.out.println("Invalid task number! ");
                        }

                        break;


                case 3:

                    if (tasks.isEmpty()){
                        System.out.println("Your Todo list is empty! ");
                    }else {
                        System.out.println("\n------ Your Task ------");
                        for(int i = 0; i < tasks.size(); i++){
                            System.out.println((i + 1) + " " + tasks.get(i));
                        }
                    }
                    break;

                case 4:

                    running = false;
                    System.out.println("Exiting todo list.....");
                    System.out.println("Bye!");
                    break;

                default:

                    System.out.println("Invalid choices! Please try again.");
            }
        }

        input.close();
    }
}
