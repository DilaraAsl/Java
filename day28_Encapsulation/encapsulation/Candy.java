package day28_Encapsulation.encapsulation;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setQuantity(int quantity){
        if(quantity<=0){
            System.err.println("invalid quantity : "+quantity);
            System.exit(1);
        }
        this.quantity=quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(double price){
        if(price<0){
            System.err.println("invalid price : "+price);
            System.exit(1);
        }
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setHasPeanuts(boolean hasPeanuts){
        this.hasPeanuts=hasPeanuts;
    }
    public boolean getHasPeanuts(){
        return hasPeanuts;
    }

    public Candy(String brand,int quantity,double price, boolean hasPeanuts){
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }
    public String toString(){
        String priceStr="";
        if(getPrice()==0) priceStr="free";
        else priceStr=String.valueOf(getPrice());
        return "Brand name "+getBrand()+"\n quantity : "+getQuantity()+"\n price "+priceStr+"\n has peanuts: "+getHasPeanuts()+"\n";
    }
}
