package Day26_Statics.RestaurantTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RestaurantTaskTester {
    public static void main(String[] args) {
    Restaurant localRest=new Restaurant("Jake","CA",5);
        ArrayList<Server>  localServers=new ArrayList<>(Arrays.asList(new Server("ben",123,20,true, LocalDate.of(2010,3,12))));
    ArrayList<Chef> localChef=new ArrayList<>(Arrays.asList(new Chef("rodrigo",12345,30,true)));
localRest.servers=localServers; // assign list to the object reference list
localRest.chefs=localChef;
    System.out.println(localRest.toString());


    }
}
