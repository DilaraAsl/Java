package day42_maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeHiredDate {
    public static void main(String[] args) {
        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));
        hiredBefore(map);
        hiredMay(map);
        hiredAfter(map);


    }

    public static void hiredBefore(Map<String, LocalDate> map) {
        LocalDate date = LocalDate.of(2015, 1, 1);
        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if (eachEntry.getValue().isBefore(date)) {
                System.out.print(eachEntry.getKey() + " ");
            }

        }
        System.out.println();
    }

    public static void hiredMay(Map<String, LocalDate> map) {
        LocalDate date = LocalDate.of(2020, 5, 15);
        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if (eachEntry.getValue().isEqual(date)) {
                System.out.println("Employee hired on 5-15-2015 is " + eachEntry.getKey());
            }
        }


    }

    public static void hiredAfter(Map<String, LocalDate> map) {
        LocalDate date = LocalDate.of(2014, 1, 1);
        System.out.println("Employees hired after 2014 : ");
        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {
            if (eachEntry.getValue().isAfter(date)) {
                System.out.println(eachEntry.getKey());
            }

        }
    }
}
