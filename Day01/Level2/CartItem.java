public class CartItem {
    //create attributes of the class
    String itemName;
    int price;
    int quantity;

    //create constructor to initialize the attributes
    CartItem(String itemName, int price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // add an item to the cart 
    void addItem(String itemName, int price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // remove an item from the cart 
    void removeItem(){
        this.itemName = null;
        this.price = 0;
        this.quantity = 0;
    }

    // display the total cost OF the items in the cart
    void displayTotalCost(){
        System.out.println("Total Cost: " + price * quantity);
    }

    public static void main(String[] args) {
            //Create an object of the CartItem class
            CartItem item = new CartItem("IPHONE", 150000, 5);
            item.displayTotalCost();
            item.removeItem();
            item.displayTotalCost();
    }
}

