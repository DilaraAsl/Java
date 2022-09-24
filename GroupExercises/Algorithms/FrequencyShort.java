package GroupExercises.Algorithms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyShort {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        findFrequency(arr);


    }

    public static void findFrequency(int[] arr) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            intMap.put(arr[i], intMap.getOrDefault(arr[i], 0) + 1);

        }
        for (Map.Entry<Integer, Integer> each : intMap.entrySet()) {
            System.out.println(each.getKey() + " is " + translateNo(each.getValue()) + " times");

        }
    }

    public static String translateNo(Integer num) {
        if (num == 0) return "";
        Map<Integer, String> singleDigits = new LinkedHashMap<>(Map.of(1, "one", 2, "two",
                3, "three", 4, "four", 5, "five",
                6, "six", 7, "seven", 8, "eight", 9, "nine", 10, "ten"));

        String result = "";

        if (num <= 10) {
            result = singleDigits.get(num);

        } else {
            result = "is more than 10";

        }

        return result;
    }
}
