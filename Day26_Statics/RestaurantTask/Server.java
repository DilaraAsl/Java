package Day26_Statics.RestaurantTask;

import java.time.LocalDate;

public class Server {
    public  String name;
    public int employeeId;
    public double hourlyRate;
    public boolean isFullTime;
   public LocalDate hireDate;

    public Server(String name, int employeeId, double hourlyRate, boolean isFullTime, LocalDate hireDate) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
        this.hireDate = hireDate;
    }
    public void takeOrder(){
        System.out.println("Server "+name+ " is taking your order. ");
    }
    public void cleanTable(){
        System.out.println("Server "+name+ " is cleaning your table. ");
    }
    public String employeeStatus(){
        if(isFullTime){
            return "Server "+name+" is a full time employee. ";
        }
        else return "Server "+name+" is a part time employee. ";
    }


    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                "," +employeeStatus()+
                ", hireDate=" + hireDate +
                '}';
    }
}
