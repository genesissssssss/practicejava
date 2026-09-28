public class NumberFilter {

    public static void main(String[] args){

        for(int i = 1; i < 100; i++){

            if (i == 50){

                break;

            }

            if (i % 3 == 0){

                continue;
            }

            System.out.print(i + " ");

        }

    }


}
