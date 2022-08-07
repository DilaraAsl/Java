package XtraTasks.CarpetCalculator554;

public class CarpetCalculatorTester {
    public static void main(String[] args) {
        RoomDimensions myRoom=new RoomDimensions(5,11);
        RoomCarpet myCarpet=new RoomCarpet(myRoom,12.5);
        System.out.println("Total Cost is : "+myCarpet.calcCost());
        System.out.println(myCarpet.toString());
    }
}
