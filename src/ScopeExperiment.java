public class ScopeExperiment {

    static String classVariable = "Bautis";


    public static void main(String[] args){

        String methodVariable = "genesis";

        System.out.println("First name : " + methodVariable);
        System.out.println("Last name: " + classVariable);

        if (true){
            String blockVariable = "Abilare";

            System.out.println("INSIDE BLOCK\n");
            System.out.println("First Name: " + methodVariable);
            System.out.println("Middle Name: " + blockVariable);
            System.out.println("Last Name: " + classVariable);
        }
        System.out.println("Outside block:\n");
        System.out.println("First Name: " + methodVariable);
        System.out.println("Last Name: " + classVariable);

        printName();

       }

    static void printName() {

        System.out.println("Inside another method:\n");


        System.out.println(classVariable);
    }
}

