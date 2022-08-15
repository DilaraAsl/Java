package XtraTasks.ParkingTicketSimulator;

import java.util.UUID;

public class ParkingDemo {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("Toyota", "Corolla", "White", "SS55321", 85);
        ParkingMeter parkingMeter = new ParkingMeter(15);
        PoliceOfficer po = new PoliceOfficer("Joe", UUID.randomUUID());
        System.out.println(po.isHasExpired(car, parkingMeter));
    }
}
