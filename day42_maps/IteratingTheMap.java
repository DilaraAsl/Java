package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingTheMap {
    // keySet(): all the keys & only the keys of the map return type is set -keys are unique
    //values(): all the values & only the values the return type is Collection - because there maybe some duplicated elements
    //entrySet(): all the entries both key and value return type is a set view of the map?
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>(); // random order, accept null key & null values
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println("-----------------------------------------------");

        //Iterating the map by the keys
        for (String eachKey : map.keySet()) {
            //map.replace(eachKey, map.get(eachKey) * 2);???
            System.out.println(eachKey);

        }
        System.out.println("------------------------------");

        //Iterating the map by values
        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);

        }
        System.out.println("---------------------------------------------------------");

        // iterating the map by entries or by pairs

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);

        }
        System.out.println("----------------------------------------------------------");
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 100000);
            System.out.println(eachKey + " " + eachValue);

        }
        System.out.println(map);

    }
}
