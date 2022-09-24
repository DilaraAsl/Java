package GroupExercises.Algorithms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyArray {
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
        Map<Integer, String> singleDigits = new LinkedHashMap<>(Map.of(0, "", 1, "one", 2, "two", 3, "three", 4, "four", 5, "five",
                6, "six", 7, "seven", 8, "eight", 9, "nine"));
        Map<Integer, String> twoDigits = new LinkedHashMap<>(Map.of(1, "ten", 2, "twenty", 3, "thirty", 4, "forty", 5, "fifty",
                6, "sixty", 7, "seventy", 8, "eighty", 9, "ninety"));
        Map<Integer, String> teens = new LinkedHashMap<>(Map.of(11, "eleven", 12, "twelve", 13, "thirteen", 14, "fourteen", 15, "fifteen",
                16, "sixteen", 17, "seventeen", 18, "eighteen", 19, "nineteen"));
        int remainder = 0;
        String result = "";
        int counter = 0;

        while (num != 0) {
            if (num > 10 && num < 20) {
                result = teens.get(num);
                num = 0;
                return result;
            } else {
                remainder = num % 10;
                if (counter == 0) {
                    result = singleDigits.get(remainder);
                    counter++;
                } else {
                    result = twoDigits.get(remainder) + result;
                    counter++;
                }
                num = num / 10;
            }

        }
        return result;
    }
}