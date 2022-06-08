package GroupExercises;

import java.util.Scanner;

public class LongestSubstringNoDuplicates {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a string : ");
        String str = kb.next();
        System.out.println(longestSubstring2(str));
    }

    public static String longestSubstring(String str) {
        int max = 0;
        String longest = ""; // will hold the longest substring
        for (int i = 0; i <str.length() ; i++) {

            String temp=""; // temp substring resets

            for (int j = i; j < str.length(); j++) {


                if ( !(temp.contains(str.charAt(j) + ""))) { // forms the temp substring
                    temp += str.charAt(j);


                } else break; // breaks out of the inner loop when detects a duplicate

            }
            if (temp.length() > max) { // compares the substring length to max substring
                max = temp.length();
                longest = temp;
            }
        }
        return longest;
    }

    public static String longestSubstring2(String str) {
        if (str.isEmpty()) return "";
        int longestStart = 0;
        int longestEnd = 1;
        int currentStartIdx = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.substring(0, i).contains(c + "")) {
                currentStartIdx = Math.max(currentStartIdx, str.substring(0, i).lastIndexOf(c + "") + 1);
            }
            // if you find a longer substring update longest here!!!
            if (longestEnd - longestStart < i + 1 - currentStartIdx) {
                longestEnd = i + 1;
                longestStart = currentStartIdx;
            }
        }
        return str.substring(longestStart, longestEnd);
    }
    public static String longestSubstring3(String str) {
        if (str.length() <= 1) return str;
        String substr = "";
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!substr.contains(ch + "")) {
                substr += ch;
            } else {
                if (longest.length() < substr.length()) {
                    longest = substr;
                }
                substr = substr.substring(substr.indexOf(ch) + 1) + ch;
                System.out.println(substr);
            }
        }
        if (longest.length() < substr.length()) {
            longest = substr; // checks if longest contains the substr with last character of str
        }
        return longest;
    }
}

