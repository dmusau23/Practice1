package EcoTransport.Models;

public class ElectricScooter extends BaseVehicle{
    private double maxSpeed;
    private double weightCapacity;

    public ElectricScooter(String ownerName, String vehicleType, String registrationNumber, double maxSpeed, double weightCapacity) {
        super(ownerName, vehicleType, registrationNumber);
        this.maxSpeed = maxSpeed;
        this.weightCapacity = weightCapacity;
    }
    @Override
    public String toString(){
        return "Vehicle Information\n" +"=====================" +"\nOwner: " +ownerName +"\nType: " +vehicleType +"\nMax Speed(Km/h): " +maxSpeed +"\nWeight Capacity(kg): "+weightCapacity +"\nRegistration Number: " +registrationNumber +"\n";

    }
}
