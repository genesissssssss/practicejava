public class Product_Info {


    String productName;
    double productPrice;
    int productQuantity;

    Product_Info(String productName, double productPrice, int productQuantity){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString(){

        return  "Product Name: " + this.productName + " " + "| Price: " + this.productQuantity + " " + "|Quantity: " + this.productQuantity;

    }
}
