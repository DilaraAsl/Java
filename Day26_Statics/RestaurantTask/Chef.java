package Day26_Statics.RestaurantTask;

public class Chef {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }
    public void makeOrder(){
        System.out.println("Chef "+name+" is preparing your order.");
    }
    public void washingDishes(){
        System.out.println("Chef "+name+" is washing the dishes.");
    }
    public String chefStatus(){
        if(isFullTime){
            return "Server "+name+" is a full time employee. ";
        }
        else return "Server "+name+" is a part time employee. ";
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                chefStatus() +
                '}';
    }
}
