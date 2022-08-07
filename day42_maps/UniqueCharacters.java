package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabbcccdddeeffl";
        char[] strArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if (frequency == 1) {
                map.put(each.charAt(0), frequency);
            }
        }
        System.out.println(map);
    }
}
