package Day17_CustomClasses;

public class ItemAttributes {
    public String name;
    public double unitPrice;
    public int quantity;

    public ItemAttributes(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String toString() {
        return "ItemAttributes{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
    public double calcCost(){
        double total=this.unitPrice*this.quantity;
        return total;
    }

}
