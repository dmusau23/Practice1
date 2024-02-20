package EcoTransport.Models;

public class Bicycle extends BaseVehicle{
    private boolean hasGears;
    private int gearCount;

    public Bicycle(String ownerName, String vehicleType, String registrationNumber, boolean hasGears, int gearCount) {
        super(ownerName, vehicleType, registrationNumber);
        this.hasGears = hasGears;
        this.gearCount = gearCount;
    }

    public Bicycle(String ownerName, String vehicleType, String registrationNumber) {
        super(ownerName, vehicleType, registrationNumber);
    }
    @Override
    public String toString(){
       if (hasGears){
           return "Vehicle Information\n" +"====================="  +"\nOwner: " +ownerName +"\nType: " +vehicleType +"\nNumber of Gears: " +gearCount +"\nRegistration Number: " +registrationNumber +"\n";

       }else{
           return "Vehicle Information\n" +"====================="  +"\nOwner: " +ownerName +"\nType: " +vehicleType +"\nRegistration Number: " +registrationNumber +"\n";
       }
    }
}
