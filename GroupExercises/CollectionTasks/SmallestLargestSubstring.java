package GroupExercises.CollectionTasks;

import java.util.*;

public class SmallestLargestSubstring {
    public static void main(String[] args) {
        String str = "welcometojava";
        int length = 5;
        System.out.println(smallestAndLargest(str, length));


    }

    public static String getSmallestAndLargest(String str, int length) {
        if (str.isEmpty() || str.isBlank()) return null; // returns null is str is empty or blank
        char[] chars = str.toCharArray();


        Set<String> orderedList = new TreeSet<>();
        for (int i = 0; i < str.length() - length - 1; i++) {
            orderedList.add(str.substring(i, i + length));

        }
        List<String> newSubstringList = new ArrayList<>(orderedList); //
        return newSubstringList.get(0) + " \n" + newSubstringList.get(newSubstringList.size() - 1);
    }

    public static String smallestAndLargest(String str, int length) {
        String smallest = str.substring(0, length);
        String largest = str.substring(0, length);
        for (int i = 0; i < str.length() - length + 1; i++) {
            if (smallest.compareTo(str.substring(i, i + length)) > 0) { // compareTo() returns >0 when the string is greater than the other string
                smallest = str.substring(i, i + length);
            }
            if (largest.compareTo(str.substring(i, i + length)) < 0) { // compareTo() returns <0 when the string is less than the other string
                largest = str.substring(i, i + length);
            }
        }
        return smallest + "\n" + largest;
    }

    static String findFirstAndLast(String s, int k) {
        int a = s.length() - k + 1;
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < a; i++) {
            set.add(s.substring(i, i + k));
        }
        System.out.println(set);
        return set.first() + "\n" + set.last();
    }

    static String findFirstAndLast1(String s, int k) {
        int a = s.length() - k + 1;
        String[] str = new String[a];
        for (int i = 0; i < a; i++) {
            str[i] = s.substring(i, i + k);
        }
        Arrays.sort(str);
        return str[0] + "\n" + str[a - 1];
    }
}


