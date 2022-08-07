package XtraTasks.Group1Tasks.week15_review;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "responsible";
        System.out.println(findFrequencyOfCharacters(str));
    }

    public static Map<Character, Integer> findFrequencyOfCharacters(String str) {
        char[] strArray = str.toCharArray();
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char each : strArray) {
            frequencyMap.put(each, frequencyMap.getOrDefault(each, 0) + 1);

        }
        return frequencyMap;
    }
}
