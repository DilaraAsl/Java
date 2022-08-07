package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("B45", "Nora");
        map.put("D12", "Beth");
        map.put("A61", "Beth");
        System.out.println(map);
        Map<String, String> employees = new LinkedHashMap<>();
        employees.putAll(map);
        System.out.println(employees);
        if (map.equals(employees)) { // equals method compares the orders
            System.out.println("Maps are identical!!!!");
        }
    }
}
