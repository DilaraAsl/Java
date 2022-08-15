package XtraTasks.ParkingTicketSimulator;

import java.util.UUID;

public class PoliceOfficer {
    private String name;
    private UUID badge;

    // private ParkedCar car;
    // private ParkingMeter pm;
    private boolean hasExpired;
    //private ParkingTicket parkingTicket;

    public PoliceOfficer(String name, UUID badge) {
        this.name = name;
        this.badge = badge;
    }

    public boolean isHasExpired(ParkedCar car, ParkingMeter pm) {
        if (car.getMin() > pm.getPurchasedTime()) {
            ParkingTicket pt = new ParkingTicket(car, car.getMin() - pm.getPurchasedTime(), new PoliceOfficer(name, badge));
            System.out.println(pt.calculateFine());
            return true;
        }
        return false;
    }

}
