package Day24_RemoveIf_DateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Task9_ArrayListLocalDate {
    public static void main(String[] args) {
        ArrayList<LocalDate> dates=new ArrayList<>(Arrays.asList(LocalDate.of(1922,10,13),LocalDate.of(2016,8,16)));
        dates.removeIf(each->each.isBefore(LocalDate.of(2016,8,15)));
        System.out.println(dates);
    }
}
