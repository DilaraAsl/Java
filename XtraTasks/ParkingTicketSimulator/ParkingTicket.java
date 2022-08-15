package XtraTasks.ParkingTicketSimulator;

public class ParkingTicket {
    private ParkedCar car;
    private double fine;
    private int minExceeded;
    private PoliceOfficer police;

    public ParkingTicket(ParkedCar car, int minExceeded, PoliceOfficer police) {
        this.car = car;
        this.minExceeded = minExceeded;
        this.police = police;
    }

    public ParkedCar getCar() {
        return car;
    }

    public int getMinExceeded() {
        return minExceeded;
    }

    public PoliceOfficer getPolice() {
        return police;
    }

    public int calculateFine() {
        if (minExceeded > 60) return 25;
        return 10;

    }
}
