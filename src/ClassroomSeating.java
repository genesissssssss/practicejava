public class ClassroomSeating {

    public static void main(String[] args){

        String[][] seatingArangement = {
                {"Marc ", "Greg ", "aira"},
                {"raden ", "nino ", "edgar"},
                {"edmar ", "Abby ", "maica"}
        };
        for (String[] row : seatingArangement){
            for(String number : row){
                System.out.println(number + " ");
            }
            System.out.println();
        }
    }
}
