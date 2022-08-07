package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("C82", "Josh");
        System.out.println(map.size()); // counts the number of pairs
        map.put("B45", "Nora");
        map.put("D12", "Beth");
        map.put("A61", "Beth");
        System.out.println(map);
        System.out.println(map.get("A61"));
        map.put("A61", "Lisa");
        System.out.println(map.get("A61"));
        System.out.println(map.size());
        map.replace("D12", "Laura");
        System.out.println(map);

    }

}
/*

pair: id-name
 */