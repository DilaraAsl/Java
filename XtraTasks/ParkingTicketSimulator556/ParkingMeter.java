package XtraTasks.ParkingTicketSimulator556;

public class ParkingMeter {
   private int purchasedMin;

    public int getPurchasedMin() {
        return purchasedMin;
    }

    public void setPurchasedMin(int purchasedMin) {
        this.purchasedMin = purchasedMin;
    }
    public ParkingMeter(int purchasedMin){
        setPurchasedMin(purchasedMin);
    }
public ParkingMeter(ParkingMeter pMeterObj){
        purchasedMin=pMeterObj.purchasedMin;
}

    public String toString() {
        return "ParkingMeter{" +
                "purchasedMin=" + purchasedMin +
                '}';
    }
}
