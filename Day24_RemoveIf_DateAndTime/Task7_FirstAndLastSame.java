package Day24_RemoveIf_DateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7_FirstAndLastSame {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        names.removeIf(each->(each.substring(0,1)).equalsIgnoreCase(each.charAt(each.length()-1)+""));
        System.out.println(names);
    }
}
