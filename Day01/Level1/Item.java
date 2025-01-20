public class Item {
    //create attributes of Item
    int itemCode;
    String itemName;
    int price;

    //create a constructor to initialize the attributes
    Item(int itemCode, String itemName, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    //Display Details of Item
    void displayDetails(){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    //Calculate total cost of the item
    void calculateTotalCost(int quantity){
        System.out.println("Total Cost: " + price * quantity);
    }
    //main method
    public static void main(String[] args) {
        
        //Create an object of the Item class
        Item item = new Item(1, "Iphone", 150000);
        item.displayDetails();
        item.calculateTotalCost(2);
    }
}

