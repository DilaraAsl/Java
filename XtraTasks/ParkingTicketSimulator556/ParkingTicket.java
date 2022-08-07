package XtraTasks.ParkingTicketSimulator556;

public class ParkingTicket {
    private ParkedCar carObj;
    private ParkingMeter pMeterObj;

    public PoliceOfficer officer;
    public ParkingTicket(ParkedCar carObj,ParkingMeter pMeterObj){
        this.carObj=getParkedCar(carObj);
        this.pMeterObj=getParkingMeter(pMeterObj);

    }

    public ParkingTicket(ParkingTicket ticket){
        carObj=ticket.carObj;
        pMeterObj=ticket.pMeterObj;
    }

    public ParkedCar getParkedCar(ParkedCar carObj){
        return new ParkedCar(carObj);
    }
    public ParkingMeter getParkingMeter(ParkingMeter pMeterObj){
        return new ParkingMeter(pMeterObj);
    }

    public double reportFine(){
      int minExcess=carObj.getNoOfMin()-pMeterObj.getPurchasedMin(); // find the minutes exceed
       if( minExcess>0){
           if(minExcess%60==0) return 25;
            else return minExcess%60*10+25;
       }

            return 0;
    }


    public String toString() {
        return "ParkingTicket{" +
                "carObj=" + carObj +
                ", pMeterObj=" + pMeterObj +"\n "+
                "\n Fine: "+reportFine()+
                '}';
    }
}


