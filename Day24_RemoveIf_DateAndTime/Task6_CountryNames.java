package Day24_RemoveIf_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6_CountryNames {
    public static void main(String[] args) {
        ArrayList<String> countryNames=new ArrayList<>(Arrays.asList("USA","United Kingdom","Germany","Australia"));
        countryNames.removeIf(each->each.length()>10);
        System.out.println(countryNames);
    }
}
