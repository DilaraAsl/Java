package XtraTasks.leetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar_3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring2(s));
    }

    public static int lengthOfLongestSubString(String s) {

        String[] sArray = s.split("");
        String newString = "";
        String maxSubString = "";
        int max = 0;
        for (int i = 0; i < sArray.length; i++) {

            if (!(newString.contains(sArray[i]))) {
                newString += sArray[i];
                continue;
            }
            if (max < newString.length()) {
                max = newString.length();
                maxSubString = newString;

            }

            newString = ""; // newString resets
            i = i - 1; // last character repeated so go back from the last character
        }
        //  System.out.println(maxSubString);
        return max;
    }

    public static int lengthOfLongestSubstring2(String s) {
        // Base condition
        if (s == null || s.equals("")) {
            return 0;
        }
        // Starting window index
        int start = 0;
        // Ending window index
        int end = 0;
        // Maximum length of substring
        int maxLength = 0;
        // This set will store the unique characters
        Set<Character> uniqueCharacters = new HashSet<>();
        // Loop for each character in the string
        while (end < s.length()) {
            if (uniqueCharacters.add(s.charAt(end))) {
                end++;
                maxLength = Math.max(maxLength, uniqueCharacters.size());
            } else {
                uniqueCharacters.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}
