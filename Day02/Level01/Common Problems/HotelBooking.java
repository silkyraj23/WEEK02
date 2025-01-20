public class HotelBooking{

    //define attributes
    private String guestName;
    private String roomType;
    private int nights;

    //default constructor
    public HotelBooking(){
        guestName = "John";
        roomType = "Delux";
        nights = 3;
    }

    //parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //copy constructor
    public HotelBooking(HotelBooking booking){
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    //using getters and setters
    public String getGuestName() {
        return guestName;
    }
    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }



    //method to display details
    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
}


class Hotel {
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Harshveer", "Premium", 1);
        HotelBooking booking3 = new HotelBooking(booking2);

        //calling default constructor
        booking1.display();

        //calling parameterized constructor
        booking2.display();

        //calling copy constructor
        booking3.display();
    }
}
