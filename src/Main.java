
public class Main {

    public static void main(String[] args){

        Product product1 = new Product("GIANT");
        Product product2 = new Product("MERIDA", 25000);
        Product product3 = new Product("TRINX", 6000, 10);
        Product product = new Product();

        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product.quantity);

        System.out.println(product1.name);
        System.out.println(product1.price);
        System.out.println(product1.quantity);

        System.out.println(product2.name);
        System.out.println(product2.price);
        System.out.println(product2.quantity);

        System.out.println(product3.name);
        System.out.println(product3.price);
        System.out.println(product3.quantity);



    }
}
