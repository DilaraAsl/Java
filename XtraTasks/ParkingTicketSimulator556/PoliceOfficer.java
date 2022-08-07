package XtraTasks.ParkingTicketSimulator556;

public class PoliceOfficer {
    private String name,badgeNO;


    private ParkingTicket pTicket;
    public PoliceOfficer(String name,String badgeNO,ParkingTicket pTicket){
        setName(name);
        setBadgeNO(badgeNO);
        this.pTicket=getParkingTicket(pTicket);
    }
    public PoliceOfficer(PoliceOfficer pOfficerObj){
        this.name=pOfficerObj.name;
        this.badgeNO=pOfficerObj.badgeNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBadgeNO() {
        return badgeNO;
    }

    public void setBadgeNO(String badgeNO) {
        this.badgeNO = badgeNO;
    }
    public ParkingTicket getParkingTicket(ParkingTicket pTicket){
        return new ParkingTicket(pTicket);
    }

    public String toString() {
        return "PoliceOfficer{" +
                "name='" + name + '\'' +
                ", badgeNO='" + badgeNO + '\'' +
                ", pTicket=" + pTicket +
                '}';
    }
}
