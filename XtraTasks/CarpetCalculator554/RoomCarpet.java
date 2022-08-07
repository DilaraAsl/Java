package XtraTasks.CarpetCalculator554;

public class RoomCarpet {
    public RoomDimensions room1;
    private double cost;
    public void setCost(double cost){
        this.cost=cost;
    }
    public double getCost(){
        return cost;
    }

    public RoomDimensions getRoomDimensions(){
        return new RoomDimensions(room1);
    }
    public double calcCost(){
        double totalCost=room1.roomArea()*cost;
        return totalCost;
    }



    public RoomCarpet(RoomDimensions room1, double cost) {
        this.room1 = room1;
        setCost(cost);
    }
    public String toString() {
        return "RoomCarpet{" +
                "room1=" + room1 +
                ", cost=" + cost +"Area: "+ getRoomDimensions()+
                '}';
    }
}
