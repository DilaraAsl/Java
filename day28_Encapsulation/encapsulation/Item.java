package day28_Encapsulation.encapsulation;

public class Item {
    private String name;
    private double unitPrice;
    private int quantity;
    public Item(String name,double unitPrice,int quantity){
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }
    public void setName(String name){
        if(name.isEmpty()||name.isBlank()){
            System.err.println("Name Unknown ");
            System.exit(1);
        }
        else if(!isNameValid(name)) {
            System.err.println("Invalid name "+name);
            System.exit(1);
        }
        this.name=name;
    }

    private boolean isNameValid(String str) {
        char[] charArr=str.toCharArray();
        if (Character.isDigit(charArr[0])) return false;

        for (char each : charArr) {
            // if each is a special character if each not empty space return false
            if(!Character.isLetterOrDigit(each)) {
                if(each!=' ') return false;

            }


        }
        return true;
    }

    public String getName(){
        return name;
    }
    public void setUnitPrice(double unitPrice){
        if(unitPrice<0)
        {
            System.err.println("Invalid unit price! "+unitPrice);
            System.exit(1);
        }
        this.unitPrice=unitPrice;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setQuantity(int quantity){
        if(quantity<0)
        {
            System.err.println("Invalid quantity! "+quantity);
            System.exit(1);
        }
        if(name.equals("toilet paper")){
            if(quantity>1){
                System.err.println("Invalid quantity for "+name+"! Quantity cannot exceed 1.");
                System.exit(1);
            }
        }

        this.quantity=quantity;
    }
    public int getQuantity(){
        return quantity;
    }
   public double totalCost(){
        return quantity*unitPrice;
   }

    public String toString() {
        return "Item{" +
                "name='" + getName() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                "Total Cost :"+totalCost()+
                '}';
    }
}
