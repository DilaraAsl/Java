package XtraTasks.Group1Tasks.week15_review;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingVowel {
    public static void main(String[] args) {
        String str = "mood";
        System.out.println(findNonRepeatingFirstVowel(str));
    }

    public static int findNonRepeatingFirstVowel(String str) {
        char[] strArray = str.toCharArray();
        Map<Character, Integer> strMap = new LinkedHashMap<>();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] == 'a' || strArray[i] == 'e' || strArray[i] == 'i' || strArray[i] == 'o' || strArray[i] == 'u') && !strMap.containsKey(strArray[i])) {
                strMap.put(strArray[i], i);
            } //

            else strMap.put(strArray[i], -1);

        }

        for (Integer value : strMap.values()) {
            if (value >= 0) return value;
        }
        return -1;
    }
}
