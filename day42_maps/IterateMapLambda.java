package day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class IterateMapLambda {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("C82", "Josh");
        map.put("B45", "Nora");
        map.put("D12", "Beth");
        map.put("A61", "Beth");
        map.forEach((k, v) -> {  // k for key and v for  value
            System.out.println(k + " : " + v);
        });
    }
}
