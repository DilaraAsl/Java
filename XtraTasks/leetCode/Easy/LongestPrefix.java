package XtraTasks.leetCode.Easy;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] list = {"flow", "flock"};
        System.out.println(findLongestPrefix(list));

    }

    public static String findLongestPrefix(String[] list) {
        if (list.length == 0) return "";
        if (list.length == 1) return list[0];
        //Sorting the array will order the list in alphabetical order
        Arrays.sort(list);
        int i = 0;
        

        String longest = "";
        // since the list is in alphabetical order we can look att
        while (i < list[0].length() && list[0].charAt(i) == list[list.length - 1].charAt(i)) {
            longest += "" + list[0].charAt(i);
            i++;
        }


        return longest;
    }
}
