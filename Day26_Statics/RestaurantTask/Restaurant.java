package Day26_Statics.RestaurantTask;

import java.util.ArrayList;

public class Restaurant {
    public String owner, location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;


    }
    public void hireServer(Server srv){
        servers.add(srv);
    }
    public void hireServer(ArrayList<Server> srv){
        servers.addAll(srv);
    }
    public void fireServer(Server srv){
        servers.remove(srv);
    }
    public void hireChef(Chef chf){
        chefs.add(chf);
    }
    public void hireChef(ArrayList<Chef> chf){
        chefs.addAll(chf);
    }
    public void fireChef(Chef chf){
        chefs.remove(chf);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +"No of servers : "+servers.size()+
                "No of chefs : "+chefs.size()+
                '}';
    }
}

