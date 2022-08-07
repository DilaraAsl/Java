package XtraTasks.ParkingTicketSimulator556;




public class TestParkingSimulator {
    public static void main(String[] args) {
        ParkedCar car = new ParkedCar("nissan", "wxy1112", 86);

        ParkingMeter pm = new ParkingMeter(60);
        ParkingTicket pTicket = new ParkingTicket(car, pm);
        PoliceOfficer pOfficer = new PoliceOfficer("Jake", "123", pTicket);
        System.out.println(pOfficer);
    }

}
