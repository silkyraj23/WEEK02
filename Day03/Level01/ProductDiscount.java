class Product {

    //define attributes
    public static int discount;
    public String productName;
    public double price;
    public int quantity;
    private final String productId;

    //create constructor
    Product(String productName, double price, int quantity, String productId){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    //method to update discount
    static void updateDiscount(double price, int quantity, int discount ){
        double discountAmount = ((price * quantity) * discount)/100;
        System.out.println("Your discount is: " + discountAmount);
        System.out.println("Price after discount is: "+ ((price*quantity) - discountAmount));
    }

    //method to display product details
    void displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Quantity: " + quantity);
        System.out.println("Product ID: " + productId);
    }
}

public class ProductDiscount{
    public static void main(String[] args) {
        //create product object
        Product product = new Product("Apple", 100.0, 10, "P001");
        product.displayProductDetails();
        Product.updateDiscount(100, 10, 10);
    }
}
