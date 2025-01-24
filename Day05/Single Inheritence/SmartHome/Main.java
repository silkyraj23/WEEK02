class Device{
    int deviceID;
    String status;
    //constructor
    Device(int deviceID,String status){
        this.deviceID=deviceID;
        this.status=status;
    }
    //method to display device details
    void display(){
        System.out.println("Device ID: "+deviceID);
        System.out.println("Status: "+status);
    }

}
//single level inheritance
class Thermostat extends Device{
    int temperature;
    String tempertureSetting;
    //constructor
    Thermostat(int deviceID,String status,int temperature,String tempertureSetting){
        super(deviceID,status);
        this.temperature=temperature;
        this.tempertureSetting=tempertureSetting;
    }
    //method to display thermostat details
    void display(){
        super.display();
        System.out.println("Temperature: "+temperature);
        System.out.println("Temperature Setting: "+tempertureSetting);
    }

}
public class Main{
    public static void main(String[] args){
        //creating the instance of the Thermostat class
        Thermostat thermostat=new Thermostat(101,"On",25,"Cool");
        thermostat.display();
    }

}
    
    
