package Day18_GarbageCollection;

public class CarpetAttributes {
    int width,length;
    double unitPrice;
    boolean isPersian;

    public CarpetAttributes(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){
        double totalPrice=width*length*unitPrice;
        if(isPersian)
        { totalPrice+=200;}
        return totalPrice;
    }


    public String toString() {
        return "CarpetAttributes{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian + "TotalCost :"+calcCost()+
                '}';
    }
}
