package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        String str = "bbcccaaaaaa";
        char[] strArray = str.toCharArray();
        for (char each : strArray) {
            if (!map.containsKey(each)) {
                map.put(each, 1);
            } else {
                int count = map.get(each);
                map.put(each, count + 1);
            }

        }
        System.out.println(map);

    }
}
