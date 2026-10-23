public class Product {

    String name;
    double price;
    int quantity;

    Product(){

        this.name = "Guest";
        this.price = 0;
        this.quantity = 0;

    }

    Product(String name){

        this.name = name;
        this.price = 0;
        this.quantity = 0;
    }

    Product(String name, double price){

        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    Product(String name, double price, int quantity){

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
