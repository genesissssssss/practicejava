
public class AreaCalculator {

    public static void main(String[] args){


        int num = calculateArea(5);
        double num2 = calculateArea(34, 30);
        double num3 = calculateArea(5.0);

        System.out.println(num);
        System.out.println(num2);
        System.out.println(num3);


    }

    static int calculateArea(int side){
        return side * side;
    }
    static double calculateArea(double radius){

        return Math.PI * radius * radius;

    }
    static double calculateArea(double length, double width){

        return length * width;

    }
}
