package EcoTransport.Models;

public class ElectricCar extends BaseVehicle{
    private double batteryCapacity;
    private double range;

    public ElectricCar(String ownerName, String vehicleType, String registrationNumber, double batteryCapacity, double range) {
        super(ownerName, vehicleType, registrationNumber);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }
    @Override
    public String toString(){
        return "Vehicle Information\n" +"====================="  +"\nOwner: " +ownerName +"\nType: " +vehicleType +"\nBattery Capacity(kWh):" +batteryCapacity +"\nRange(Km): " +range +"\nRegistration Number: " +registrationNumber +"\n";

    }
}
