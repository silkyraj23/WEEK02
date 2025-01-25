abstract class FoodItem{
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }

    public void setItemName(String itemName){
        this.itemName=itemName;
    }

    public String getItemName(){
        return itemName;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    abstract double calculateTotalPrice();

    public String getItemDetails(){
        return "Item Name: "+itemName+" price: "+price+" quantity: "+quantity;
    }
}

interface Discountable{
    void applyDiscount(double discount);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable{
    private double discount = 0.0;
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void applyDiscount(double discount) {
       this.discount=discount;
    }

    @Override
    public String getDiscountDetails() {
      return "Discount Applied "+ discount;
    }

    @Override
    double calculateTotalPrice() {
        return getQuantity() * getPrice() * (1 - discount / 100);
    }
}

class NonVegItem extends FoodItem implements Discountable{

    private static final double ADDITIONAL_CHARGE = 1.2; // Non-veg items have a 20% surcharge
    private double discount = 0.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getQuantity() * getPrice() * ADDITIONAL_CHARGE * (1 - discount / 100);
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discount + "%";
    }
}
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Creating food items
        FoodItem vegItem = new VegItem("chola kulcha", 210.50, 2);
        FoodItem nonVegItem = new NonVegItem("Chilli Paneer", 199.65, 5);

        // Applying discounts
        Discountable discountableVeg = (Discountable) vegItem;
        discountableVeg.applyDiscount(20); // 20% discount for vegetarian item

        Discountable discountableNonVeg = (Discountable) nonVegItem;
        discountableNonVeg.applyDiscount(10); // 10% discount for non-vegetarian item

        // Displaying item details and total price
        System.out.println(vegItem.getItemDetails());
        System.out.println(discountableVeg.getDiscountDetails());
        System.out.println("Total Price (Veg): $" + vegItem.calculateTotalPrice());

        System.out.println(nonVegItem.getItemDetails());
        System.out.println(discountableNonVeg.getDiscountDetails());
        System.out.println("Total Price (Non-Veg): $" + nonVegItem.calculateTotalPrice());
    }
}

