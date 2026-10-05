

public class FlexibleCalculator {
    public static void main(String[] args){

        System.out.println(calculateSum(5, 5, 5, 5));
        System.out.println(calculateSum(10, 5, 5, 5));
        System.out.println(calculateSum(10, 10, 5, 5));
        System.out.println(calculateSum( 5, 5, 5));


    }
    static int calculateSum(int... numbers){

        int sum = 0;

        if (numbers.length == 0){
            return 0;
        }
        for (int number : numbers){
            sum += number;
        }

        return sum;

    }
}
