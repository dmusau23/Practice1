package EcoTransport.Models;

import org.w3c.dom.ls.LSOutput;

public class EcoTransportTester {
    public static void main(String[] args) {
        BaseVehicle car1 = new BaseVehicle("Abram","Diesel","GAZ2150");
        ElectricCar car = new ElectricCar("Daniel Musau","Electric","FGH1123",500,100);
        Bicycle bicycle1 = new Bicycle("Jason Malourde","Bicycle","JKD9087",true,7);
        Bicycle bicycle2 = new Bicycle("Kelce Plumee","Bicycle","LKK6766");
        ElectricScooter scooter = new ElectricScooter("Madison Planet","Electric Scooter","SDF0000",30,200);

        System.out.println(car1);
        System.out.println(car);
        System.out.println(bicycle1);
        System.out.println(bicycle2);
        System.out.println(scooter);
    }
}
