class Order {
    // Attributes of Order class
    int orderID;
    String orderDate;
    String orderStatus;
    String orderItems;

    // Constructor
    Order(int orderID, String orderDate, String orderStatus, String orderItems) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.orderItems = orderItems;
    }

    // Method to display order details
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Order Items: " + orderItems);
    }

    // Method to update order status
    void updateOrderStatus(String newStatus) {
        orderStatus = newStatus;
    }
}

class ShippedOrder extends Order {
    // Attributes of ShippedOrder class
    int trackingNumber;
    String shippingDate;
    String shippingAddress;

    // Constructor
    ShippedOrder(int orderID, String orderDate, String orderStatus, String orderItems, int trackingNumber, String shippingDate, String shippingAddress) {
        super(orderID, orderDate, orderStatus, orderItems);
        this.trackingNumber = trackingNumber;
        this.shippingDate = shippingDate;
        this.shippingAddress = shippingAddress;
    }

    // Method to display order details
    @Override
    void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Shipping Date: " + shippingDate);
        System.out.println("Shipping Address: " + shippingAddress);
    }
}

class DeliveredOrder extends ShippedOrder {
    // Attributes of DeliveredOrder class
    String deliveryDate;

    // Constructor
    DeliveredOrder(int orderID, String orderDate, String orderStatus, String orderItems, int trackingNumber, String shippingDate, String shippingAddress, String deliveryDate) {
        super(orderID, orderDate, orderStatus, orderItems, trackingNumber, shippingDate, shippingAddress);
        this.deliveryDate = deliveryDate;
    }

    // Method to display order details
    @Override
    void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class Main {
    // Method to return the current order status
    public static String getOrderStatus(Order order) {
        return order.orderStatus;
    }

    public static void main(String[] args) {
        // Creating object of Order class
        Order order = new Order(101, "12-12-2021", "Pending", "Mobile, Laptop, Headphones");
        // Displaying order details
        order.displayOrderDetails();
        // Updating order status
        order.updateOrderStatus("Shipped");
        // Displaying order details
        order.displayOrderDetails();

        // Creating object of ShippedOrder class
        ShippedOrder shippedOrder = new ShippedOrder(102, "13-12-2021", "Shipped", "Mobile, Laptop, Headphones", 12345, "14-12-2021", "New York");
        // Displaying order details
        shippedOrder.displayOrderDetails();

        // Creating object of DeliveredOrder class
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "14-12-2021", "Delivered", "Mobile, Laptop, Headphones", 12346, "15-12-2021", "New Jersey", "16-12-2021");
        // Displaying order details
        deliveredOrder.displayOrderDetails();

        // Calling getOrderStatus method
        System.out.println("Order Status: " + getOrderStatus(order));
        System.out.println("Order Status: " + getOrderStatus(shippedOrder));
        System.out.println("Order Status: " + getOrderStatus(deliveredOrder));
    }
}
