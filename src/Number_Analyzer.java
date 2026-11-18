import java.util.Scanner;
public class Number_Analyzer {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.println("------ Number Analyzer ------\n" );

        System.out.print("Enter an Integer: ");
        String integerInput = input.nextLine();

        Integer integerNumber = Integer.valueOf(integerInput);

        System.out.print("Enter A Decimal: ");
        String doubleInput = input.nextLine();

        Double doubleNumber = Double.valueOf(doubleInput);

        System.out.print("Are you a Student? (true/false): ");
        String booleanInput = input.nextLine();

        Boolean boleanValue = Boolean.valueOf(booleanInput);

        System.out.println("Enter a character: ");
        String characterInput = input.nextLine();

        Character characterValue = characterInput.charAt(0);

        System.out.println("\n ------- Analyzer ------- ");

        System.out.println("Interger: " + integerNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Boolean: " + boleanValue);
        System.out.println("Character: " + characterValue);

        if (boleanValue){
            System.out.println("You are a student!");
        }else{
            System.out.println("You are not a student!");
        }
        System.out.println("Uppercase Character: " + Character.toUpperCase(characterValue));



        input.close();


    }

}
//**// auto boxxing
//    int primitiveInt = 50;
//    Integer integerObject = primitiveInt;
//
//    double primitiveDouble = 33.3;
//    Double doubleObject = primitiveDouble;
//
//        System.out.println("Auto Boxxing\n");
//
//        System.out.println("Primitive Int: " + primitiveInt);
//        System.out.println("Object: " + integerObject);
//        System.out.println();
//        System.out.println("Double Int: " + primitiveDouble);
//        System.out.println("Double Object: " + doubleObject);
//
//    //Unboxing
//
//    Integer num1 = 200;
//    int primitiveInt2 = num1;
//
//    Double num2 = 60.3;
//    double primitiveDouble2 = num2;
//
//        System.out.println("Boxxing\n");
//
//        System.out.println("Int: " + num1);
//        System.out.println("Primitive Int: " + primitiveInt2);
//        System.out.println();
//        System.out.println("Double: " + num2);
//        System.out.println("Double Int: " + primitiveDouble2);**//