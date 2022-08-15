package XtraTasks.leetCode.Easy;

import java.util.Map;
import java.util.TreeMap;

public class LongestPrefixHashMap {
    public static void main(String[] args) {
        String[] strs = {"flat", "flamboyant", "flank"};
        System.out.println(longestCommonPrefix(strs));


    }

    public static String longestCommonPrefix(String[] strs) {
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < strs.length; i++) {
            map.put(strs[i], strs[i].length());
        }
        // find minimum value in the map
        Integer min = map.get(strs[0]);
        String minStr = "";
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            if (min > eachEntry.getValue()) {
                minStr = eachEntry.getKey();
                min = eachEntry.getValue();
            }
        }

        String temp = "";
        int count = 0;
        String prefix = "";
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (!temp.contains(strs[j].charAt(i) + "")) {
                    temp = strs[j].charAt(i) + "";

                } else count++;
            }
            if (count == strs.length - 1) {
                prefix += temp;
            }
            count = 0;
            temp = "";
        }


        return prefix;
    }
}
