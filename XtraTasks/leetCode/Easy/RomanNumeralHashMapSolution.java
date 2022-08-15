package XtraTasks.leetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralHashMapSolution {
    public static void main(String[] args) {
        String s = "MCM";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                if (romanNumerals.get(s.charAt(i)) < romanNumerals.get(s.charAt(i + 1))) {
                    sum -= romanNumerals.get(s.charAt(i));
                } else sum += romanNumerals.get(s.charAt(i));
            } else sum += romanNumerals.get(s.charAt(i)); // add the last number at the end of the string
        }

        return sum;
    }
}